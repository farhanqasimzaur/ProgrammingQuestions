package threads;

import java.util.Queue;

public class MyThread extends Thread{

	private volatile Queue<Integer> queue;
	
	MyThread(Queue<Integer> queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {

		try {
			while(!queue.isEmpty()){
				Integer temp = queue.poll();
				System.out.println(temp);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
