package threads;

public class RunnableThreadExample {

	public static void main(String args[]) {
		Thread thread1 = new Thread(new RunnableThread(), "thread1");
		Thread thread2 = new Thread(new RunnableThread(), "thread2");
		RunnableThread thread3 = new RunnableThread("thread3");
		//Start the threads
		thread1.start();
		thread2.start();
		try {
			//delay for one second
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
		}
		//Display info about the main thread
		System.out.println(Thread.currentThread());
	}
	
}


class RunnableThread implements Runnable{

	Thread thread;
	
	
	RunnableThread(){
		this("Random");
	}
	
	RunnableThread(String name){
		thread = new Thread(this, name);
		System.out.println(thread.getName());
		thread.start();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		
	}
	
}