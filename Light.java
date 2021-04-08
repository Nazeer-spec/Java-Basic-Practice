class Light
{
	/*
	parameters : boolean,boolean
	return     : int
	*/
	public static int test(boolean a,boolean b)
	{

		if(a==true && b==true)
		{
			return 1;
		}
		else if(a==false && b==false)
		{
			return 0;
		}
		else if(a==true && b==false)
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
	 	int b1=test(true,false);
	 	System.out.println("Display"+b1);
		
	}
}