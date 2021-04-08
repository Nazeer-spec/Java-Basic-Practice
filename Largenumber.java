class Largenumber
{
	/*
	parameters : int,int,int
	return     : int
	*/
	public static int largest(int a, int b, int c) 
	{
		
		if (a>b && a>c)
		{
		return a;	
		}
		else if (b>a && b>c)
		{
			return b;
		}
		else 
		{
			return c;
		}
	}
	public static void main(String[] args) 
	{
		int  large;
		large=largest(10,20,30);
		System.out.println("Largest number is="+large);

	}
}