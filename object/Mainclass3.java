class Student extends Object
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
	public boolean equals(Object obj)
	{
		if(this.hashCode()==obj.hashCode())
			{return true;}
		else {return false;}

	}

	@Override
	public int hashCode()
	{
		return id;
	}

}
class Mainclass3
{
public static void main(String[] args) {
	
	Student s1=new Student(123,"Smith",444.20);
	Student s2=new Student(123,"Smith",444.20);

	System.out.println(s1);

	boolean b1=s1.equals(s2);
	System.out.println(b1);
}
}