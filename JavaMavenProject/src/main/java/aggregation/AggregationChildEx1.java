package aggregation;

public class AggregationChildEx1 {
String bookname;
int bookcost;
AggregationEx1 ref;
public AggregationChildEx1(String bookname,int bookcost, AggregationEx1 ref)
{
this.bookname=bookname;
this.bookcost=bookcost;
this.ref=ref;
}
public void display()
{
System.out.println(ref.authorname +","+ref.authorid);
System.out.println(bookname+","+bookcost);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub

	AggregationEx1  obj1=new AggregationEx1 ("sinu",121);
	AggregationChildEx1 obj2= new AggregationChildEx1("java",1235,obj1);
	obj2.display();
	}

}
