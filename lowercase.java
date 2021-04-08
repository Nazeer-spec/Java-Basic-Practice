import java.util.Scanner;
class lowercase
{
	public static String test(String str) 
	{
		String res="";
		
		for(int i=0;i<str.length();i++)
		{
			char n =str.charAt(i);
             int m=n;

             if(m>=65 && m<=90)
             {
             	m = m+32 ;
             	char c=(char)m;	
             	res=res+c;
             }
             else 
             {
             	res=res+(char)m;
             }
		}
		return res;

	}


	public static void main(String[] args) 
	{
		System.out.println("start....");

		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter the String");
		String b1=test(a1.nextLine());
		System.out.println("Entered String is : "+b1);

		System.out.println("end.....");
	}
}