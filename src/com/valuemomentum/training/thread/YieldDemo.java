package com.valuemomentum.training.thread;

class MyThread3 extends Thread{
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName()+"in Control ");
        }
    }
}
public class YieldDemo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread3 t=new MyThread3();
        t.start();
        
        for(int i=0;i<5;i++) {
            Thread.yield();//control passes to child thread
            
            //After execution of child thread
            //main thread takes over
    System.out.println(Thread.currentThread().getName()+" in control ");        
        }
    }

 

}
 