class Static_class1
{
	static int x=10;
	public static void test()
	{
		System.out.println("This is test()");
		System.out.println("x ="+x);
	}

	public static void main(String[] args) 
	{
	System.out.println("x ="+x);
	test();
	}
}