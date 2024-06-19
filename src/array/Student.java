package array;

import java.util.Collections;
import java.util.LinkedList;

public class Student {
	public static void main(String[] args) {
		LinkedList l=new LinkedList ();
		
		
		l.add(10);
		l.add(23.23);
		l.add("satya");
		l.add(true);
		l.add("shitesh");
		l.add("santosh");
		l.add(400);
		
		System.out.println("size : "+l.size());
		System.out.println("===============");
		
		System.out.println(l);
		Collections.sort(l);
		for(Object o : l)
		{
			System.out.println(o);
		}
		
		
		}
	}


