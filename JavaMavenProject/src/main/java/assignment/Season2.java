package assignment;

public class Season2 extends Seasons{
	float price;
	float discount;
	
	public void Calculationofdiscount(float price)
	{ 
		
		this.price=price;
		discount=.40f*price;
		super.Calculationofdiscount(price);
		 System.out.println("off season price :" +price+", "+"offseason discount"+discount
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Season2 obj1=new Season2();
 
 obj1.Calculationofdiscount(6000f);
 
 
	}

}
