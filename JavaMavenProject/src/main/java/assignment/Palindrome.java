package assignment;

public class Palindrome {
	public static int reverse(int num)
	{
		int reverse=0;
		while(num!=0)
		{ int digit = num%10;
		reverse= reverse *10+digit;
		num=num/10;
		}
		System.out.println("Reverse numberis "+reverse);
		return reverse;
		
		}
	public static void Palindrom(int num)
	{
		int reversenumber = reverse(num);
		if (num==reversenumber)
		{
			System.out.println("Number is Palindrome ="+num);
		}
		else
		{
		System.out.println("Number is not Palindrome ="+num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome.Palindrom(131);
		Palindrome.Palindrom(132);



	}

}
