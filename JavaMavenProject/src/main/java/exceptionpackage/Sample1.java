package exceptionpackage;

public class Sample1 

{
	int a,b,c;
	
	
	public void operation()
	{
    a=8;
	b=0;
	try
	{
		c=a/b;// chances of exception.
	}
	catch(ArithmeticException e)/* next step after what do*/
	{System.out.println("division by zero"+e);
	
	}
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1 obj1=new Sample1();
				obj1.operation();
	}

}
