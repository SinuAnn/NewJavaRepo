package interfacepackage;

public class InterfaceClass implements InterfaceTest
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass obj1 =new InterfaceClass();
obj1.display();
		
	}
 public void display()
 {int a=12;
 int b=10;
 int c= a+b;
 System.out.println("Adding of two numbers"+c);
 }
 
}
