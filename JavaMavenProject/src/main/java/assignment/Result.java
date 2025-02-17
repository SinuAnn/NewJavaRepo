package assignment;

public class Result extends Divisible
{
public void div()
{
	super.add();
	super.c=c;
	if (c%10==0)
	{
		System.out.println("num is divisible by 10");
	}
	else
	{
		System.out.println("num is not divisible by 10");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Result obj1=new Result();
obj1.div();
	}

}
