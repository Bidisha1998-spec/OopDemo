package com.valuemomentum.training.inputoutput;
import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.name="Michael";
		e.address="castle street,blore";
		e.SSN=11122333;
		e.number=101;
		try
		{
			FileOutputStream fileout= new FileOutputStream("c:/demo/employee.ser");
			ObjectOutputStream out= new ObjectOutputStream(fileout);
			out.writeObject(e);
			out.close();
			fileout.close();
			System.out.println("serialized data is saved in c:/demo/employee.ser ");
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
				
		

	}

}
