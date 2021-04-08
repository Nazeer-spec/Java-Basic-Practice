class Light1
{
	/*
	parameters : int,int
	return     : int
	*/
	public static int test(int a,int b)
	{

		if(a==1 && b==1)
		{
			return 1;
		}
		else if(a==0 && b==0)
		{
			return 0;
		}
		else if(a==1 && b==0)
		{
			return 5;
		}
		else
		{
			return 10;
		}
	}
	public static void main(String[] args)
	 {
	 	int b1=test(1,1);
	 	System.out.println("Display"+b1);
		
	}
}