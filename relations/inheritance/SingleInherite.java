class SuperClass
{
 int v1=123;

 public void display()
 {
 	System.out.println("Display() of Super class");
 }
}
class SubClass extends SuperClass
{
 double z1=20.20;

 public void test()
 {
 	System.out.println("Test() of SubClass");
 }
}
class SingleInherite
{
	public static void main(String[] args) 
	{
	SuperClass s1 = new SuperClass();
	System.out.println("V1 = "+s1.v1);
	s1.display();

	SubClass s2 = new SubClass();
	System.out.println("Z1 = "+s2.z1);
	s2.test();

	System.out.println("V1 = "+s2.v1);
	s2.display();	
	}
}