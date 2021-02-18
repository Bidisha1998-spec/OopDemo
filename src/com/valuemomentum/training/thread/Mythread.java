package com.valuemomentum.training.thread;

public class Mythread extends Thread {
	 public static void main(String[] args) {
		 Mythread obj= new Mythread();
		 obj.create();
		 System.out.println("this is the main thread");
	 }
	 public void create()
	 {
		 Thread obj1= new Thread(this);
		 obj1.start();
	 }
	 public void run()
	 {
		 while(true)
		 {
			 try
			 {
				 System.out.println("this is the child thread");
				 Thread.sleep(500);
			 }
			 catch(InterruptedException e)
			 {}
		 }
	 }

}
