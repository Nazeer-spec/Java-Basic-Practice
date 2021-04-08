class Non_static
{
	long k=9876543210l;
	static int v=1234;

	public void count() 
	{
		System.out.println("This is Count()");
		System.out.println("k ="+k);
		System.out.println("v ="+v);
	}

	public static void main(String[] args) 
	{
	System.out.println(new Non_static().k);
	new Non_static().count();
	}

}