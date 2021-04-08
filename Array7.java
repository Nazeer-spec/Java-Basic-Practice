class Array7
{
	public static int[] copyArray(int[] a1) 
	{
		int[] res=new int[a1.length-2];
		for(int index=1; index<a1.length-1; index++)
		{
			res[index-1]=a1[index];
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

	int[] c1 = copyArray(b1);
	for(int i=0;i<c1.length;i++)
		{
			System.out.print(c1[i]+" ");
		}
	}
}