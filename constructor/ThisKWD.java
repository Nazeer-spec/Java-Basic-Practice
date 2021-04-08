class Demo
{
	String name;//global variable
	int id;
	double sal;
	int deptno;

	public Demo(String name,int id,double sal,int deptno)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.deptno=deptno;
	}

	public void show_details()
	{
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
		System.out.println("Salary = "+sal);
		System.out.println("DeptNo. = "+deptno);
	}
}
class ThisKWD
{
public static void main(String[] args) 
{
Demo d= new Demo("Smith",12345,5000.10,20);
d.show_details();
Demo d1= new Demo("Nazi",67890,6000.50,10);
d1.show_details();	
}
}