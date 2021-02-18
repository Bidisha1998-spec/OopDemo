package com.valuemomentum.training.exceptionhandling;

public class ThrowsDemo {

	
		void Division()throws ArithmeticException
		{
			int a=45;
		int	b=67;
		int rs=a/b;
		System.out.println("\n\t the result is:" +rs);
		
			
		}
		public static void main(String[] args) {
			ThrowsDemo T= new ThrowsDemo();
			try {
				T.Division();
			}
			catch(ArithmeticException ex)
			{
				System.out.println("\n\t error:" +ex.getMessage());
			}
		

	}

}
