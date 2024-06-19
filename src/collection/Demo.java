package collection;

import java.util.ArrayList;
public class Demo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(223.45);
		al.add("santosh");
		System.out.println(al);
		System.out.println("------------------");
		
		
		System.out.println("size: "+al.size());
		System.out.println("==========================");
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println("==========================");
	    
		
		System.out.println(al.contains(20));
		System.out.println(al.contains(10));
		System.out.println(al.contains(10));
		System.out.println(al.contains(10));
		System.out.println(al.contains(50));
		System.out.println(al.contains(223.45));
		System.out.println("===========================");
		
		
		al.remove(2);
		System.out.println(al);
		System.out.println("=========================");
		
		
		System.out.println(al.isEmpty());
		
		
		
	}

}
