package com.valuemomentum.training.thread;

public class ThreadRunExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
	Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
	System.out.println("Starting Runnable threads");
	t1. start();
	t2.start();
	System.out.println("Runnable Threads has been started");
	Thread t3= new MyThread22("t3");
	Thread t4= new MyThread22("t4");
	System.out.println("starting my tread ");
	t3.start();
	t4.start();
	System.out.println("mytread has been started ");
	
	
	


	}

}
