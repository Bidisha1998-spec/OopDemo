package com.valuemomentum.training.exceptionhandling;
import java.util.*;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result;
		Scanner in= new Scanner(System.in);
		System.out.println("enter 2 ints");
		a=in.nextInt();
		b=in.nextInt();
		try {
				result=a/b;
				System.out.println("result:"+result);}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught: div by zero");
		}
		finally
		{
			in.close();
			System.out.println("in fianlly block");
		}
				

	}

}
