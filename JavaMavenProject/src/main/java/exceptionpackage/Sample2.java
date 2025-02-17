package exceptionpackage;

public class Sample2 {
	
		
		
		public void operation()
		{
	    int i;
		int[] arr=new int[4];
		try {
		for (i=0;i<=4;i++)
		{
		arr[i]=i+1;
		
			
			System.out.println(i);
	
		}}
		catch
		
			(ArrayIndexOutOfBoundsException e)
		
{   System.out.println("ArrayIndexOutOfBoundsException"+e);
		}
			finally
			{
			System.out.println("exception complete");
			}}
		
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub

			Sample2 obj1=new Sample2();
					obj1.operation();
		}

}



	

	


