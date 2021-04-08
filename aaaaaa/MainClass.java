Class Demo
{
   static int x;
   static
   {
      x=10;
      System.out.println(x);
   }
}
class MainClass
{
	public static void main(String[] args) {
		A.x;
	}
}