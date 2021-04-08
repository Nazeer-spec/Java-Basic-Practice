class Array6
{
	public static int[] reverse(int[] a1) 
	{
		int[] res = new int[a1.length];
		int j=a1.length-1;
		for(int i=0; i<a1.length;i++)
		{
			res[i]=a1[j];
			--j;
		}
		return res;
	}
	public static void main(String[] args) 
	{
	int[] b1 = new int[4];

	b1[0]=20;
	b1[1]=40;
	b1[2]=60;
	b1[3]=80;

	int [] v = reverse(b1);
		for(int i=0;i<v.length;i++)
		{
			System.out.print(v[i]+" ");
		}
	}
}