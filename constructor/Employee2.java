class Demo
{
	String name;
	int id;
	double sal;

	public Demo(String a,int b,double c)
	{
		name=a;
		id=b;
		sal=c;
	}

	public void show_details()
	{
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
		System.out.println("Salary = "+sal);
	}
}
class Employee2
{
public static void main(String[] args) 
{
Demo d= new Demo("Smith",12345,5000);
d.show_details();
Demo d1= new Demo("Nazi",67890,6000);
d1.show_details();	
}
}