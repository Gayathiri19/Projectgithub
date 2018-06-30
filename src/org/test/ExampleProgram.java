package org.test;

import java.util.ArrayList;
import java.util.List;

public class ExampleProgram {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(40);
		a.add(50);
		a.add(100);
		a.add(56);
		a.add(100);
		a.add(90);
		System.out.println(a);
		System.out.println(a[2]);
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).equals(100))
			{
			 a.set(i, 10);
			}
		}
		System.out.println(a);
	}
}
