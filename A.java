class A
{
	A()
	{
	System.out.println("nazeer");
	}
	A(int a)
	{ this();
		int res=a;
		System.out.println(res);
	}
	A(int a,int b)
	{ this(10);
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		//A a = new A();
		//A b = new A(10);
		A c = new A(10,20);
	}
}