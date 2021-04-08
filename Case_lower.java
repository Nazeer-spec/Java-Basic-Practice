import java.util.Scanner;
class Case_lower
{
	public static String test(String str) 
	{	
		int n =str.length();
		String S1="";
		

  		for(int i = n ;i>0;i--)
  		{
   			int u = str.charAt(i);
   			if(u>=97 && u<=122)
   				{   
   					S1 = S1 +str.charAt(i);	
   				}
  			 else
   				{
   					u=u+32;
   					S1=S1 + (char)u;	
   				}
		}
		return S1;
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