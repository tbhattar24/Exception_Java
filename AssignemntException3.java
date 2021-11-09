import java.util.Scanner;
		public class Except2
		{
			double balance= 150000.00;
			 long id=1241;
			double deposit,withdraw_amount;
			
			public void savingsaccount()  
			{
				System.out.println("account Id "+id);
				 System.out.println("Choose 1 for Withdraw");
		         System.out.println("Choose 2 for Deposit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		{
		try 
		{
		if(n==1)
		{
		System.out.println("enter withdrawal amount");
		withdraw_amount=sc.nextDouble();
		withdraw_amt();
		}
		if(n==2)
		{
			System.out.println("enter deposit amount");
			deposit=sc.nextDouble();
			balance=balance+deposit;
			System.out.println("deposited amount is: "+deposit);
			System.out.println("Total amount "+balance);
		}
		}
		catch(InsufficientBalanceException e) 
		{
			System.out.println(e);
			System.out.println("there is no sufficient balance");
			System.out.println("the balance is: "+balance);
			System.out.println("enter the withdrawal amount again within the balance");
			withdraw_amount=sc.nextDouble();
			balance = balance-withdraw_amount;
			System.out.println("the balance left is: "+balance);
		}
		catch(IllegalBankTransactionException e) 
		{
			System.out.println(e);
			
		}
		}
		}
		 public void withdraw_amt() throws InsufficientBalanceException,IllegalBankTransactionException
		{
			if(withdraw_amount>balance)
			{
		    throw new InsufficientBalanceException("insufficient balance");
		    
		 }
			
			else
			{
				balance = balance-withdraw_amount;
				System.out.println("withdrawal amount is: "+withdraw_amount);
		 if(withdraw_amount<0)
		 {
			 throw new IllegalBankTransactionException("wrong input");
			 
		 }
		 System.out.println("balance left is: "+balance);}}
			
			public static void main(String args[])
		{

				Except2 at=new Except2();
		        at.savingsaccount();
		}
		
	}
       
		 class InsufficientBalanceException extends Exception
		{
		    public InsufficientBalanceException(String msg) 
		{
			super(msg);
		}

		}
		 class IllegalBankTransactionException extends Exception
		 {
		    public IllegalBankTransactionException(String msg)
		 {
		 	super(msg);
		 }

		 }