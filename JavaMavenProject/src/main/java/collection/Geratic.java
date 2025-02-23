package collection;

import java.util.ArrayList;
import java.util.List;

public class Geratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		List <String> obj1=new ArrayList<String>();
		obj1.add("Sinu");
		obj1.add("Hello");
		obj1.add("Anu");
		obj1.add("Vinu");
		obj1.add("Maya");
		System.out.println(obj1);
		System.out.println(obj1.set(1,"Nikhil"));
		System.out.println(obj1.indexOf("Anu"));
		System.out.println(obj1.lastIndexOf("Vinu"));
		obj1.remove(0);
		System.out.println(obj1);
		obj1.remove("Vinu");
		System.out.println(obj1);
		System.out.println(obj1.get(1));
		System.out.println(obj1);
		System.out.println(obj1.contains("Maya"));
		System.out.println(obj1);
		
	}

}}
