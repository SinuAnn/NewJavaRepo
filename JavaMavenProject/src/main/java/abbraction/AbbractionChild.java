package abbraction;

public class AbbractionChild extends AbbractionEx	

{
public static void main(String[] args) {
	AbbractionChild obj1= new AbbractionChild();
	obj1.display();
	obj1.display2();
	obj1.add();
} 
public void display2()
{
	System.out.println("this is abraction method");
}

public void add()
{
int a=10;
int b=15;
int c=a+b;
{
	System.out.println("adding of two numberes : "+c);
}

}
}
