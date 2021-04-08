class CaseLower
{
	public static String test(String str)
	{	
		int n = str.length();
		String S1="";
  		for(int i=0 ;i<n;i++)
  		{
   			int u = str.charAt(i);
   			if(u>=97 && u<=122)
   				{   
   					S1.charAt(i) = str.charAt(i); 		
   				}
  			 else
   				{
   					u = u + 32;
   					char f = (char)u;
   					S1.charAt(i) = f;
   				}
		}
		return S1;
  	}
public static void main(String[] args) 
	{
		System.out.println("start....");

		String a1=test("JSPIDER");
		System.out.println(a1);
	}
}