
package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al= new ArrayList<String>();
		al.add("jim");
		al.add("pam");
		al.add("michael");
		al.add("dwight");
		
		Iterator itr= al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(al.get(1));
        al.add(3, "Raj");
        al.remove(0);
        al.set(1, "Java");
        
        System.out.println("****** Display *******");
        for(String i:al)
        {
        	System.out.println(i);
        }
		
		
		

	}

}
