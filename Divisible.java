class Divisible
{
	/*
	parameters : int,int
	return     : boolean
	*/
	public static boolean test(int a,int b)
	{
	if(a% 5 == 0 && b % 5 == 0)
	{
		return true;
	}	
	return false;
	}
	public static void main(String[] args) 
	{
		boolean c=test(20,40);
		System.out.println("c ="+c);

	}
}