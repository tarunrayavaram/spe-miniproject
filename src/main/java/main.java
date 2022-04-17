import java.util.*;
import calculator.calculator;

class main
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Choose the given options. Press the integers based on the option to choose");
		System.out.println("1) Square Root");
		System.out.println("2) Factorial");
		System.out.println("3) Natural Logarithm(base e)");
		System.out.println("4) Power");
		int choice = scn.nextInt();
		if(choice == 1)
		{
			System.out.println("type the integer:");
			int num = scn.nextInt();
			double result = calculator.square_root(num);
			System.out.println("square root of "+num+" is:"+result);
		}
		else if(choice == 2)
		{
			System.out.println("type the integer:");
			int num = scn.nextInt();
			int result = calculator.factorial(num);
			System.out.println("factorial of "+num+" is:"+result);
		}
		else if(choice == 3)
		{
			System.out.println("type the integer:");
			int num = scn.nextInt();
			double result = calculator.log(num);
			System.out.println("natural log of "+num+" is:"+result);
		}
		else if(choice == 4)
		{
			System.out.println("type the base integer:");
			int base = scn.nextInt();
			System.out.println("type the power integer:");
			int pow = scn.nextInt();
			int result = calculator.power(base, pow);
			System.out.println(base+" to the power of "+pow+" is:"+result);
		}
		else
		{
			System.out.println("Made wrong choice");
		}
	}
}