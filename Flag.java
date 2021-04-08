class Flag
{
	/*
	parameters : int,boolean
	return     : boolean
	*/
	public static boolean test(int a,boolean b)
	{
		if(a>=1 && a<=10 && b==false)
		{
			return true;
		}
		else 
			{return false;}

	}
	public static void main(String[] args)
	 {
		boolean b1= test(4,true);
		System.out.println(b1);
	}
}