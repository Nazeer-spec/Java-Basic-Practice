import java.util.HashSet;

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
class MainSetStudent
{	
	

	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();

		h1.add(new Student(123,"Smith",420.20));
		h1.add(new Student(223,"Smitha",430.5));
		h1.add(null);
		h1.add(new Student(124,"Sitha",520.66));
		h1.add(null);

		for(Object obj:h1)
		{
			System.out.println(obj);
		}
	}
}