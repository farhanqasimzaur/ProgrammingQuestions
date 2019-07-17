package threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(6);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		
		
		long startTime = System.nanoTime();
		
		MyThread t1 = new MyThread(queue);
		MyThread t2 = new MyThread(queue);
		MyThread t3 = new MyThread(queue);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		long totalTime = System.nanoTime() - startTime;
		System.out.println("Total Time Threading: " + totalTime);
	}
}
