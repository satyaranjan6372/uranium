package array;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet hs=new HashSet <>();
		hs.add(10);
		hs.add("santosh");
		hs.add("200.04");
		hs.add(false);
		hs.add(10);
		hs.add(false);
		hs.add("santosh");
		hs. add(30);
		hs.add(true);
		
		for(Object o : hs)
		{
			System.out.println(o);
		}
		
		
	}

}
