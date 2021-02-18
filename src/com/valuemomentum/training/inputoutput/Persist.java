package com.valuemomentum.training.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

 

public class Persist {

 

    public static void main(String[] args) throws IOException {
        Student s1=new Student(101,"Raj");
        
        FileOutputStream fout=new FileOutputStream("c:/demo/f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        
        out.writeObject(s1);
        out.flush();
        System.out.println("Success");
        // TODO Auto-generated method stub

 

    }

 

}