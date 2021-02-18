package com.valuemomentum.training.exceptionhandling;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lang[]= {"C","C++","java","phy","c#"};
		try
		{
			for(int c=1;c<=5;c++)
			{
				System.out.println(lang[c]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}

	}

}
