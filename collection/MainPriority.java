import java.util.PriorityQueue;
import java.util.Comparator;
class Customer /*implements Comparable*/
{
	int priority;
	String name;
	String address;

	public Customer(String name, String address, int priority)
	{
		
		this.name=name;
		this.address=address;
		this.priority=priority;
	}

	@Override
	public String toString()
	{
		String info= name+" "+address+" "+priority;
		return info;
	}

	/**@Override
	public int compareTo(Object obj)
	{
		Customer c3=(Customer) obj;

		String name1 = c3.name;
		String name2 = this.name;
		int res1 = name2.compareTo(name1);
		return res1;
	}*/
	
}
class MainPriority
{
	public static void main(String[] args) 
	{
		Comparator c1=(Object obj1,Object obj2) ->
						{
							Customer d1=(Customer) obj1;
							Customer d2=(Customer) obj2;
							return d1.priority-d2.priority;
						};

		Comparator c2=(Object obj1,Object obj2) ->
						{
							Customer d1=(Customer) obj1;
							Customer d2=(Customer) obj2;
							String s1=d2.name;
							String s2=d1.name;
							int res=s1.compareTo(s2);
							return res;
						};

		PriorityQueue p1= new PriorityQueue(c1);
		
		p1.add(new Customer("","",1));
		p1.add(new Customer("aeu","kerur",1));
		p1.add(new Customer("bazi","kerur",2));
		p1.add(new Customer("aow","kerur",3));
		p1.add(new Customer("cei","kerer",4));
		
		System.out.println(p1.isEmpty());

		while(p1.isEmpty()==false)
		{
			System.out.println(p1.poll());
		}

		System.out.println(p1.isEmpty());
	}
}