package assignment;

public class Seasons {

	float discount;
	float price;
	
	 public void Calculationofdiscount(float price)
	 {
		 this.price=price;
		 discount=.15f*price;
		 System.out.println("onseason price :"+price +", "+"onseason discount"+discount);
		 
	 }
}
