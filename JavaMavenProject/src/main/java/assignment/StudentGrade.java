package assignment;

public class StudentGrade {
 int total; 
 int sub1,sub2,sub3;
	public StudentGrade(String name,int sub1, int sub2, int sub3)
	{ 
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public int display()
	{
		total =sub1+sub2+sub3;
		int avg=total/3;
		
		if (avg>=80)
		{
			System.out.println("your grade is A");
		}
		else if(avg>=71 && avg<80)
        {
           System.out.println("your grade is B");
        } 
        else if(avg>=60 && avg<70)
        {
           System.out.println("your grade is C");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.println("your grade is D");
        }
        else 
        {
            System.out.println("failed");
        }

		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentGrade obj1=new StudentGrade("sinu",20,40,60);
StudentGrade obj2=new StudentGrade("Meenu",70,70,50);
System.out.println("Grade and Total marks of sinu");
System.out.println(" Total marks earned  by Sinu in 3 subjects  ="+obj1.display());
System.out.println("Grade and Total marks of Meenu");
System.out.println("Total marks earned by Meenu in 3 subjects ="+obj2.display());

	}}


