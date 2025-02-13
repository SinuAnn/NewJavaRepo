package assignment;

public class StaticFact 
{
	 static long result =1;
	
		public static long fact()
		{
			int n=5;
			result=1;
		for(int i=1;i<=n;i++)
		{
		
			result=result*i;
		}
	return result;
	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 result=fact();
		System.out.println("Factorial of 5:"+result);
	}

}
