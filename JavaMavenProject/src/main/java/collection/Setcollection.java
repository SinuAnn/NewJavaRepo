package collection;

import java.util.HashSet;
import java.util.Set;

public class Setcollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		Set <String> obj1=new HashSet<String>();
		obj1.add("Sinu");
		obj1.add("Hello");
		obj1.add("Anu");
		obj1.add("Vinu");
		System.out.println(obj1);
	    System.out.println(obj1.contains("Anu"));
	   obj1.remove("Hello");
	   
	    System.out.println(obj1);
	   
	
		
		
	}

}

}
