package assignment;

public class AverageChild extends Average
{
	public void area(float r)
	{
		float pi=3.14f;
		float area=pi*r*r;
		System.out.println("Area of Circle ="+area);
	}
	public void area(int a,int b)
	{
		int area=a*b;
		System.out.println("Area of Rectangle ="+area);
	}
	public void area(double a)
	{
		double area=a*a;
		System.out.println("Area of Square ="+area);
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageChild a=new AverageChild();
		a.area(10);
		a.area(10,10);
		a.area(12d);
		a.Average1();
		a.Average1(10.5f,11.5f,11.5f);
	}

}
