package assignment;

public class Factorial {
	int  factorial;

	public int FactorialNum(int num)
	{
	this.factorial=1;

		for (int i=1 ; i<=num;i++)
		
		{
         factorial = factorial * i;
        
        }
        this.display();	
     return factorial;
	
	}
	public void display ()
    {
		
		System.out.println("Factorial of number is:"+factorial);
	}		
	public static void main(String[] args)
	{
		
	Factorial obj1=new Factorial ();
	obj1.FactorialNum(6);
	
	
	}}