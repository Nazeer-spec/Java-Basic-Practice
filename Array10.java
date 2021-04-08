class Array10
{
	public static boolean test(int[] a1) 
	{
	int sum=0;
    sum=a1[0]+a1[(a1.length-1)/2];
    if(sum==a1[a1.length-1])
    	return true;
    else
    	return false;

    }
    public static void main(String[] args) 
	{
	int[] a1 = new int[5];
     boolean b1;
	a1[0]= 10;
    a1[1]= 20;
    a1[2]= 30;
    a1[3]= 50;
    a1[4]= 40;

    b1=test(a1);
    System.out.println(b1);
    }
}