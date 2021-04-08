class Array3
{
	public static boolean test(int[] a1) 
	{
	int last_second,sum=0;
    System.out.println("second="+a1[1]);
    last_second=a1.length-2;
    System.out.println("second last="+a1[last_second]);
    sum=a1[1]+a1[last_second];
    if(sum>50)
    	return true;
    else
    	return false;

    }
    public static void main(String[] args) 
	{
	int[] a1 = new int[4];
     boolean b1;
	a1[0]= 10;
    a1[1]= 20;
    a1[2]= 30;
    a1[3]= 40;

    b1=test(a1);
    System.out.println(b1);
    }
}