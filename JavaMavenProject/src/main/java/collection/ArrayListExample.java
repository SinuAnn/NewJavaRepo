package collection;

import java.util.ArrayList;

public class ArrayListExample {

public static void main(String[] args) {
	ArrayList<String>obj1=new ArrayList<String>();
	
	obj1.add("orange");
	obj1.add("blue");
	obj1.add("red");
	obj1.add("black");
	obj1.add("white");
	System.out.println(obj1);

ArrayList<String>obj2=new ArrayList<String>();
obj2.add("sinu");
obj2.add("place");
obj2.add("thiruvalla");
obj2.addAll(obj1);//combine 2 array
System.out.println(obj2);
System.out.println(obj2.contains("sinu"));
System.out.println(obj2.get(2));
System.out.println(obj2.isEmpty());
obj2.remove(0);//to remove from arraylist
System.out.println(obj2);
System.out.println(obj2.size());
}}
