package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratedexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>obj1=new ArrayList<String>();
		
		obj1.add("orange");
		obj1.add("blue");
		obj1.add("red");
		obj1.add("black");
		obj1.add("white");
		Iterator<String>it=obj1.iterator();
		
		while(it.hasNext())//to place the iterator on the first location and checkif element is present
		{
			System.out.println(it.next());
		}
	it.remove();
	System.out.println(obj1);
	}

}
