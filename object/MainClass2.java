class Sample extends Object
{
	@Override
	public int hashCode()
	{
		return 10;
	}

	@Override
	public String toString()
	{
		return ("toString() is Overriden");
	}
}

class MainClass2
{
	public static void main(String[] args) {
		

		Sample s1= new Sample();

		int i1=s1.hashCode();
		System.out.println("i1 = "+i1);

		String str = s1.toString();
		System.out.println("str = "+str);
	}
}