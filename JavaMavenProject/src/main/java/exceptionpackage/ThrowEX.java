package exceptionpackage;

public class ThrowEX {
	static boolean eligible(int age)
	{
		  return age >=18;
	} 
		
	               public static void main(String[] args)
		{  
	            int age = 20;

	                   if (eligible(age))
	                   {
	                       System.out.println("You are eligible for voting.");
	                   } else {
	                       throw new ArithmeticException("not eligible to vote");
	               }
		}}


