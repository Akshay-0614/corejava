package corejava;

public class BankAccount {
	
	int Accountno;
	String AccountHoldername;
	double Balance;
    static int accountnogenerator =7737;
    	{
    			Accountno = accountnogenerator;
    			accountnogenerator++;
    	}
    		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a = new BankAccount();
		a.AccountHoldername = "D.Akshay kumar";
		a.Balance =50400;
		System.out.println(a.AccountHoldername+ "Details");
		System.out.println("Account Number :"+a.Accountno);
		System.out.println("Account Holder Name :"+a.AccountHoldername);
		System.out.println("Balance :"+a.Balance);
		
		BankAccount b = new BankAccount();

		b.AccountHoldername = "V.Akhil";
		b.Balance =30000;
		System.out.println(b.AccountHoldername+ " Details");
		System.out.println("Account Number :"+b.Accountno);
		System.out.println("Account Holder Name :"+b.AccountHoldername);
		System.out.println("Balance :"+b.Balance);
		
		BankAccount c = new BankAccount();

		c.AccountHoldername = "P.Shanmukh";
		c.Balance =30400;
		System.out.println(c.AccountHoldername+ " Details");
		System.out.println("Account Number :"+c.Accountno);
		System.out.println("Account Holder Name :"+c.AccountHoldername);
		System.out.println("Balance :"+c.Balance);
		
		BankAccount d = new BankAccount();

		d.AccountHoldername = "D.Mahesh";
		d.Balance =44000;
		System.out.println(d.AccountHoldername+ " Details");
		System.out.println("Account Number :"+d.Accountno);
		System.out.println("Account Holder Name :"+d.AccountHoldername);
		System.out.println("Balance :"+d.Balance);
		
		BankAccount e = new BankAccount();

		e.AccountHoldername = "P.Naveen";
		e.Balance =20000;
		System.out.println(e.AccountHoldername+ " Details");
		System.out.println("Account Number :"+e.Accountno);
		System.out.println("Account Holder Name :"+e.AccountHoldername);
		System.out.println("Balance :"+e.Balance);
		
	}

}
