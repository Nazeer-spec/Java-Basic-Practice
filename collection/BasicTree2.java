import java.util.TreeSet;

class Student implements Comparable
{
	int id;
	String name;
	double marks;

	public Student(int id,String name, double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString()
	{
		String info= name+" "+id+" "+marks;
		return info;
	}

	@Override
	public int CompareTo(Object obj)
	{
		Student s1=(Student) obj;

	}
}

class BasicTree2
{
	public static void main(String[] args) 
	{
		TreeSet t1=new TreeSet();

		t1.add(new Student())

		
		for(Object obj:t1)
		{
			System.out.println(obj);
		}
	}
}