class Demo
{
	String name;
	int id;
	public void Emp_details()
	{
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
	}
}
class Employee1
{
public static void main(String[] args) 
{
Demo d= new Demo();
d.Emp_details();
Demo d1= new Demo();	
}

}