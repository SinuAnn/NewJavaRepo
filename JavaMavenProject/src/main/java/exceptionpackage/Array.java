package exceptionpackage;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try
{
int z[]=new int[5];
z[7]=10;
System.out.println(z[7]);

}
catch (ArrayIndexOutOfBoundsException e) {
	// TODO: handle exception
	
	System.out.println("array exceed the limit");
	System.out.println(e);
}

}}