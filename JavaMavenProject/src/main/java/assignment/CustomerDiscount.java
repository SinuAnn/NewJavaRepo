package assignment;

public class CustomerDiscount {
	 public static double TotalAmount(double price1, double price2, double price3) {
	        return price1 + price2 + price3;
	    }

	    public static double Discount(double totalAmount) {
	        if (totalAmount > 5000) {
	            return totalAmount - (totalAmount * 0.2);
	        } else {
	            return totalAmount;
	        }
	    }

	    public static void main(String[] args) {
	        double price1 = 2000;
	        double price2 = 2000;
	        double price3 = 1500;

	        double totalAmount = TotalAmount(price1, price2, price3);
	        double finalAmount = Discount(totalAmount);

	        System.out.println("Total Amount: " + totalAmount);
	        System.out.println("Final Amount: " + finalAmount);
	    }
	}

