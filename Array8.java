class Array8
{
	public static int testArray(int[] a1) 
	{
		int sum = 0;
		for(int i = 0; i < a1.length ; i++)
		{
			if(i%2==1)
			{
				sum =  sum + a1[i];
				
			}
			
		}
		return sum;
	}
	public static void main(String[] args) 
	{
	int[] b1 = new int[5];

	b1[0]=20;
	b1[1]=30;
	b1[2]=40;
	b1[3]=50;
	b1[4]=60;

	int c1=testArray(b1);
	System.out.println("sum of all integer value at odd index = "+c1);
	}
}