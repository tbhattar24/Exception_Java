   
//1.ARITHMETIC EXCEPTION 

package Exception_Handling;
import java.lang.*;
import java.util.Scanner;
public class Except1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
	double i = sc.nextDouble();
	System.out.println("enter the second number");
	double j = sc.nextDouble();
	try 
	{
		double p = i/j;
		System.out.println(p);
	}
	catch(ArithmeticException rv)
	{
		System.out.println(rv);
	}
	{
		System.out.println("Denominator cannot be zero");
		System.out.println("Re-enter the second number");
		j = sc.nextDouble();
		System.out.println("division is: "+i/j);
	}
	
	
}
}

