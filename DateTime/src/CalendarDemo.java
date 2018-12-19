import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DATE);
		int day_of_week = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		String[] days = {"日","一","二","三","四","五","六"};
		System.out.println("Today is 星期" + days[day_of_week - 1]);
		
		String wdays = "日一二三日五六";
		System.out.println("Today is 星期" + wdays.charAt(day_of_week - 1));
		
		System.out.println("Today is " + year + "/" + month + "/" + day);
		System.out.println("Today is  " + (day_of_week - 1));
		
	   
		System.out.println("時間是" + hour + ":" + minute + ":" + second);
		System.out.printf("時間是%d:%02d:%02d%n",hour, minute ,second);
		System.out.println("時間是" + hour 
				+ ":" + ((minute < 10) ? "0" + minute : minute)  
				+ ":" + ((second < 10) ? "0" + second : second));
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println("時間是"+sdf.format(today.getTime()));
	}

}
