class Account
{
	String name;
	String bio;

	public Account()
	{}

	public Account(String name,String bio)
	{
		this.name=name;
		this.bio=bio;
	}

	public void showAccount()
	{
		System.out.println("Name = "+name);
		System.out.println("Bio = "+bio);
	}
}
class User
{
	String username;
	String password;

	Account a1 = new Account();//important
}
class Composition
{
	public static void main(String[] args) 
	{
	User u1 = new User();
	u1.a1.showAccount();	
	}
}