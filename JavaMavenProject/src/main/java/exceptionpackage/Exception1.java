package exceptionpackage;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=20;
int y=0;
try
{
int z=x/y;
System.out.println(z);

System.out.println("hi");
  
}

catch(ArithmeticException var)
{
	x=20;
y=2;
int z=x/y;
System.out.println(z);
System.out.println(var);

}
/* finally for execution*/ 
finally
{
	System.out.println("exception complete");
}
}}

