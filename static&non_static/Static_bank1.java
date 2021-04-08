class Account
{
	long actno=545454545454l;
	String type="Savings";
	String owner= "Nazi";
	String branch="BTR";
	double bal=0.0;
	static String bankname="ICICI";

	public void deposite(int amt)
	{
		bal=bal+amt;
	}

	public void withdraw(int amt)
	{
		bal=bal-amt;
	}

	public void show_balance()
	{
		System.out.println("Balance is "+bal);
	}

	public static void show_bankname()
	{
		System.out.println("Bank = "+bankname);
	}
	public void show_act_details()
	{
		System.out.println("Account No. = "+actno);
		System.out.println(" Account Type = "+type);
		System.out.println("Name = "+owner);
		System.out.println("Branch = "+branch);
		System.out.println("Balance = "+bal);
		System.out.println("Bank Name = "+bankname);
	}
}
class Static_bank1
{
	public static void main(String[] args) 
	{
		Account ref1=new Account();
		Account ref2=ref1;
		System.out.println("ref1 = "+ref1);
		System.out.println("ref2 = "+ref2);
		ref1.show_balance();
		ref1.deposite(5000);
		ref1.show_balance();
		ref2.show_balance();

	}
}