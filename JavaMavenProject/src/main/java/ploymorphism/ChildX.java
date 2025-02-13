package ploymorphism;

public class ChildX extends Parent1 {
	public void add(int a,int b)
	 {
		 int c=a-b;
		 System.out.println(c);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 obj2 =new Parent1();
	ChildX obj1=new ChildX();
	obj1.add(30,20);
	obj2.add(20,20);
	}

}
