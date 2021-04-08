class Demo
{
	public Demo()
	{
		//this(10);
		System.out.println("Zero argument Demo()");
	}

	public Demo(int x1)
	{
		this();
		System.out.println("Demo(int x1)");
	}
}

class ThisState
{
	public static void main(String[] args) 
	{
	new Demo(10);	
	}
}