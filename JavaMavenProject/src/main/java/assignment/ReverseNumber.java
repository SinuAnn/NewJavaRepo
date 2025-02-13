package assignment;

public class ReverseNumber {

 int num,reverse=0;;
	public ReverseNumber(int num)
	{
		this.num=num;
		int tempnum=num;
       		       while(tempnum!=0)
			{
		 
				  int remainder = tempnum % 10; 
				  reverse = reverse * 10 + remainder;  
				  tempnum = tempnum/10;
				  
           }
           
	}
	
	
	public void display()
	{
		
		System.out.println("The reverse of the given number is: " +reverse);
	}
	
	
		public static void main(String [] args)
				{
								
				ReverseNumber r= new ReverseNumber(569);
	            System.out.println("The number to be reversed:"+r.num);
				r.display();
								
				}
}