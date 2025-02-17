package exceptionpackage;

public class ExtractionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	try
	{
	int num="Sinu";
	System.out.println(num);

	}	
catch(NumberFormatException var)
{
	int num=10;
System.out.println("Cannot convert the string to a number");
System.out.println(var);

}
/* finally for execution*/ 
finally
{
	System.out.println("exception complete");
}
}
	
	}


