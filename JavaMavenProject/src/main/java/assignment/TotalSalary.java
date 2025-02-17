package assignment;

public class TotalSalary extends SalaryDetails
{
float Hra,PF,total;
	public TotalSalary(int BasicPay, int Deduction, int Bonus) {
		super(BasicPay, Deduction, Bonus);
		// TODO Auto-generated constructor stub
		Hra=.05f*BasicPay;
		PF=.2f*BasicPay;
total= BasicPay+Hra-PF-Deduction+Bonus;
	}
	public void add()
	{
		
		
		System.out.println("HRA:"+Hra);
		
		System.out.println("PF:"+PF);
		System.out.println("TotalSalary :" +total);
	}

	

	}


