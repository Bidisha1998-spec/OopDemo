package com.valuemomentum.training.thread;
class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread"+Thread.currentThread().getId()+"is running");
	}
	
	}
public class MultiThreadDemo {
	public static void main(String[] args)
	{
		int n=8;
		for(int i=1;i<=5;i++)
		{
			Test t= new Test();
			t.start();
		}
	}
	

}
