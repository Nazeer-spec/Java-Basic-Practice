class Selfmethod1
{
	public static double findAvg(int n1, int n2, int n3) 
	{
		double sum=0.0;
		double avg;
		sum=n1+n2+n3;
		avg=sum/3;
		return avg;
	}
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		double res;
		double avg;
		avg=findAvg(10,20,30);
		res=avg*100;
		res=res/10;
		System.out.println("res="+res);
		avg=findAvg(20,30,40);
		res=avg/20;
		res=res+1000;
		System.out.println("res="+res);
		System.out.println("program ends...");

	}
}