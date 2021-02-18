package com.valuemomentum.training.exceptionhandling;
public class StringBufferDemo {

	 

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        StringBuffer str=new StringBuffer("JamesGosling");
        int l=str.length();
        System.out.println("The length of string is :"+l);
    System.out.println("The Capacity of String is: "+str.capacity());
    
    System.out.println(str.substring(0,5));//returns string from starting index to lenght-1
    System.out.println(str.replace(5, 10, "bidi"));
    System.out.println(str.delete(2, 5));
    System.out.println(str.reverse());
    
    }

 

}