import java.util.TreeSet;

class BasicTree
{
	public static void main(String[] args) 
	{
		TreeSet t1=new TreeSet();
		t1.add(new String("hello"));
		t1.add("ball");
		t1.add("BALL");
		t1.add("world");
		t1.add("ball");


		for(Object obj:t1)
		{
			System.out.println(obj);
		}






	}
}