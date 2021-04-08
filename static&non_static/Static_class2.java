class Mainclass
{
	static double z= 21.21;
	public static void display() 
	{
		System.out.println("Display of Static_class2 ");
	}
}
class Static_class2
{
	public static void main(String[] args) 
	{
	System.out.println("z ="+Mainclass.z);
	Mainclass.display();
	}

}