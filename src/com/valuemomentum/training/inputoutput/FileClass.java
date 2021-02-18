package com.valuemomentum.training.inputoutput;

import java.io.*;



public class FileClass {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            File f=new File("c:/Test/Hello.txt");
            if(f.createNewFile()) {
                System.out.println("New File Created");
                
            }
            else
            {
                System.out.println("The file already exists.");
            
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

 

    

 

}