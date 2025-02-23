package collection;

import java.util.ArrayList;

public class Array_Listexp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>obj1=new ArrayList<String>();
		
		obj1.add("orange");
		obj1.add("blue");
		obj1.add("red");
		obj1.add("black");
		obj1.add("white");
		/*syntax for(datatype variablename : collectio name)
		{
	}*/
		for(String i:obj1)
		{System.out.println(i);
		}
		}
	}


