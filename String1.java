class String1
{
 public static boolean test(String a1) 
 {
 
  String res="";
  for(int i=a1.length()-1;i>=0;i--)
  {
  	res=res+a1.charAt(i);
  }
if(a1.equals(res))
	return true;
else 
	return false;
 }
 public static void main(String[] args) 
 {
 	String b1="ssss";
 boolean c1=test(b1);
 System.out.println(c1); 
 }

}
//if(str.length()>=3 &&(str.charAt(1)=='b'&&str.charAt(2)=='a'&&str.charAt(3)=='d'))
 // return true;
 // else if(str.length()>=3 && (str.charAt(0)=='b'&&str.charAt(1)=='a'&&str.charAt(2)=='d'))
 // return true;
 // else 
  //return false;