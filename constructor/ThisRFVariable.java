class Demo
{
	public void test()
	{
		System.out.println("test() of Demo class");
		System.out.println("this = "+this);
	}
}

class ThisRFVariable
{
	public static void main(String[] args) 
	{
	Demo d1= new Demo();
	d1.test();
	System.out.println("d1 = "+d1);

	Demo d2= new Demo();
	d2.test();
	System.out.println("d2 = "+d1);

	//d1.test();
	}
}