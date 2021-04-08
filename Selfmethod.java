class Selfmethod
{
	public static void add(int n1, int n2) 
	{
		int sum;
		sum=n1+n2;
		System.out.println("sum="+sum);
		return;
	}
	public static void main(String[] args) 
	{
		add(30,40);//method calling
	}
}