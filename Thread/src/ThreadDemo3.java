
public class ThreadDemo3 extends Thread {
	
	public ThreadDemo3 (String name) {
		super(name);
	}

	public void run() {
		for(int i = 0; i < 100; i++) 
			System.out.println(getName() + ":Number " + i);
	}
	
	public static void main(String[] args) {
		
		new ThreadDemo3("Thread 1").start();
		//ThreadDemo3 t1 = new ThreadDemo3("Thread 1");
		//t1.setName("Thread 1");
		//t1.start();
		new ThreadDemo3("Thread 2").start();
		//ThreadDemo3 t2 = new ThreadDemo3("Thread 2");
		//t2.setName("Thread 2");
		//t2.start();
        
	}

}
