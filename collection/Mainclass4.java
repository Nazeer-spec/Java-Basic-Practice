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
class Mainclass4
{
	public static void findPer(Student[] st1)
	{
		double per=0.0;
		for(int i=0;i<st1.length;i++)
		{
			per=(st1[i].marks/600)*100;
			System.out.println("Name = "+st1[i].name);
			System.out.println("Percentage = "+per);
		}
	}

	public static void main(String[] args) {

	Student[] S_list= new Student[3];
	
	S_list[0]=new Student(123,"Smith",444.20);
	S_list[1]=new Student(124,"Smith",442.20);
	S_list[2]=new Student(125,"Nazi",300.50);
	findPer(S_list);
}
}