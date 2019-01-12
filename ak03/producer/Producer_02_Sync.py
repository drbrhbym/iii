#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

from confluent_kafka import Producer
import sys
import time

'''
* 示範: Sending a Message Synchronously
* 由於librdkafka(C++)都是用async來寫, 所以使用confluent_kafka的client並無法真正支援sync的訊息發佈
'''

# 用來接收從Producer instance發出的error訊息
def error_cb(err):
    print('Error: %s' % err)
    
# Optional per-message delivery callback (triggered by poll() or flush())
# when a message has been successfully delivered or permanently
# failed delivery (after retries).
def delivery_callback(err, msg):
    if err:
        sys.stderr.write('%% Message failed delivery: %s\n' % err)
    else:
        # 為了不讓打印訊息拖慢速度, 我們每1萬打印一筆recordMetata來看
        if int(msg.key())%10000==0:
            sys.stderr.write('%% Message delivered to topic:[%s]-partition:[%d] @ offset[%o]\n' %
                             (msg.topic(), msg.partition(), msg.offset()))

# 主程式進入點
if __name__ == '__main__':
    # 步驟1. 設定要連線到Kafka集群的相關設定
    props = {
        # Kafka集群在那裡?
        'bootstrap.servers': 'localhost:9092',    # <-- 置換成要連接的Kafka集群
        'error_cb': error_cb                            # 設定接收error訊息的callback函數
    }

    # 步驟2. 產生一個Kafka的Producer的實例
    producer = Producer(**props)

    # 步驟3. 指定想要發佈訊息的topic名稱
    topicName = 'ak03.syncsending'
    msgCount = 100000  # 10萬筆

    try:
        print('Start sending messages ...')
        time_start = int(round(time.time() * 1000))

        # produce(topic, [value], [key], [partition], [on_delivery], [timestamp], [headers])
        '''
        // ** 示範: Synchronous Send **
        // 在以下的"send().get()"的同步發佈訊息的過程, 透過同步我們可以取得由Broker回覆訊息發佈的ack結果
        // 由於這種方法是一筆一筆的送與等待Broker的回應。因此這種方法的throughput最差 (通常不會用Kafka來做這種事)
        '''

        for i in range(0, msgCount):
            producer.produce(topicName, key=str(i), value='msg_'+str(i), callback=delivery_callback)
            producer.poll(0) # 呼叫poll來讓client程式去檢查內部的Buffer, 並觸發callback

            if i%10000==0:
                print('Send {} messages'.format(i))

        time_spend = int(round(time.time() * 1000)) - time_start

        print('Send        : ' + str(msgCount) + ' messages to Kafka')
        print('Total spend : ' + str(time_spend) + ' millis-seconds')
        print('Throughtput : ' + str(msgCount/time_spend * 1000) + ' msg/sec')

    except BufferError as e:
        # 錯誤處理
        sys.stderr.write('%% Local producer queue is full (%d messages awaiting delivery): try again\n' % len(producer))
    except Exception as e:
        print(e)
    # 步驟5. 確認所有在Buffer裡的訊息都己經送出去給Kafka了
    producer.flush(10)
    print('Message sending completed!')
