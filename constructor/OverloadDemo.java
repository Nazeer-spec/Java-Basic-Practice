class Demo
{
	public Demo()
	{
		System.out.println("Zero argument Demo()");
	}

	public Demo(int x1)
	{
		System.out.println("Demo(int x1)");
	}

	public Demo(double x1)
	{
		System.out.println("Demo(x1)");
	}

	public Demo(int x1,double y1)
	{
		System.out.println("Demo(int x1, double y1)");
	}

	public Demo(double x1,int y1)
	{
		System.out.println("Demo(int y1,double x1)");
	}
}

class OverloadDemo
{
	public static void main(String[] args) {
		new Demo();
		new Demo(10);
		new Demo(10.10);
		new Demo(10,11.25);
		new Demo(10.25,10);

	}
}