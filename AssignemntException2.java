import java.util.Scanner;
public class Assignment3 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter numerator and denominator");
	int num = sc.nextInt();
	int deno = sc.nextInt();
	try
	{
		double div = divide(num,deno);
		System.out.println(div);
	}
	catch(UnsupportedOperationException e)
	{
		System.out.println("denomitor cannot be 0");
	}
}
  public static double divide(int num , int deno) throws UnsupportedOperationException
  {
	  if(deno==0)
	  {
		  throw new UnsupportedOperationException("exception");
	  }
	  return num/deno;
  }
}
