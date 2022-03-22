import java.util.*;
import calculator.calculator;
import java.io.*;

class main
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Choose the given options. Press the integers based on the option to choose");
		System.out.println("1) Square Root");
		System.out.println("2) Factorial");
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
		else
		{
			System.out.println("Made wrong choice");
		}
	}
}