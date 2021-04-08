class Whats1
{
	public void SendMsg()
	{
		System.out.println("Send Message");
	}
}
class Whats2 extends Whats1
{
	public void SendVioceMsg()
	{
		System.out.println("Send Vioce Message");
	}
}
class Whats3 extends Whats2
{
	public void SendVideoCall()
	{
		System.out.println("Send Video Call");
	}
}
class Multi
{
	public static void main(String[] args) 
	{
	Whats1 w1= new Whats1();
	w1.SendMsg();

	Whats2 w2= new Whats2();
	w2.SendVioceMsg();
	w2.SendMsg();

	Whats3 w3= new Whats3();
	w3.SendVideoCall();
	w3.SendVioceMsg();
	w3.SendMsg();
	}
}