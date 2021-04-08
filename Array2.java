class Array2
{
	public static void test(int[] a1) 
	{
	int mid,last;
    System.out.println("first ="+a1[0]);
    last=a1.length-1;
    System.out.println("last element="+a1[last]);
    mid=(a1.length-1)/2;
    System.out.println("mid element="+a1[mid]);

	}
	public static void main(String[] args) 
	{
	int[] a1 = new int[4];

	a1[0]= 10;
    a1[1]= 20;
    a1[2]= 30;
    a1[3]= 40;

    test(a1);

	}
}