package assignment;

public class Voting {
	
	
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
	                       System.out.println("You are not eligible for voting.");
	                   }
	               }
	           }


		       
		
