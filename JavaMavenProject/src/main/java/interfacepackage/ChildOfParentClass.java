package interfacepackage;

public class ChildOfParentClass implements Parent1,Parent2
{
public static void main(String[] args) {
	ChildOfParentClass obj1= new ChildOfParentClass();
	obj1.add();
	obj1.sub(12,10);
}
	@Override
	public void sub(int a,int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println("subtraction of numbers :"+c);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("Addition of two numbers: "+c);
	}

}
