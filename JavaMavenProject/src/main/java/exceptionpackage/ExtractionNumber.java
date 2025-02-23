package exceptionpackage;

public class ExtractionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str="sinu";
	try
	{
	int num=Integer.parseInt(str);
	System.out.println(num);

	}	
catch(NumberFormatException var)
{
	
System.out.println("Cannot convert the string to a number"+var);

}
/* finally for execution*/ 
finally
{
	System.out.println("exception complete");
}
}
	
	}


