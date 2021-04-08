class Array9
{
	public static int[] test(int[] a1) 
	{
		int[] res = new int[(a1.length-1)-((a1.length-1)/2)];
		int j = 0;
		for(int i=((a1.length-1)/2)+1; i<a1.length ;i++)
		{
			res[j]=a1[i];
			++j;
		}

		return res;
	}
	public static void main(String[] args) 
	{
	int[] b1 = new int[5];

	b1[0]=20;
	b1[1]=40;
	b1[2]=60;
	b1[3]=80;
	b1[4]=100;

	int[] c1 = test(b1);
	for(int i=0;i<c1.length;i++)
		{
			System.out.print(c1[i]+" ");
		}
	}
}