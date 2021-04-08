class Array11
{
	public static int[] test(int[] a1) 
	{
		int[] res = new int[a1.length];
		
		for(int i=0; i<a1.length;i++)
		{
			if (a1[i]%2==1)
			{
				a1[i]= -1 ;
				res[i]=a1[i];
			}
			res[i]=a1[i];
		}
		return res;
	}
	public static void main(String[] args) 
	{
	int[] b1 = new int[5];

	b1[0]=21;
	b1[1]=40;
	b1[2]=63;
	b1[3]=80;
	b1[4]=95;

	int [] v = test(b1);
		for(int i=0;i<v.length;i++)
		{
			System.out.print(v[i]+" ");
		}
	}
}