class Array5
{
	public static int[] copyArray(int[] a1) 
	{
		int[] res=new int[a1.length];
		for(int index=0; index<=a1.length-1; index++)
		{
			res[index]=a1[index];
		}
			return res;
	}
	public static void main(String[] args) 
	{
	int[] b1 = new int[4];

	b1[0]=20;
	b1[1]=30;
	b1[2]=60;
	b1[3]=80;

	int[] c1 = copyArray(b1);
	for(int i=0;i<c1.length;i++)
		{
			System.out.print(c1[i]+" ");
		}
	}
}