package superKeyword; 

public class SuperChild1 extends SuperParent1{ //to refer the immediate parent class instance variable
	String name ="Riya";
	public void display()
	{
		System.out.println(name);
		System.out.println(super.division);
	}
	public static void main(String[] args) {
		SuperChild1 obj =new SuperChild1();
		obj.display();
		
	}

}
