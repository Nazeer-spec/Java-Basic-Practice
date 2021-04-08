class MainClass
{
	public static void main(String[] args) {
		

		Object obj1 = new Object();
		int h1 = obj1.hashCode();
		System.out.println("h1 = "+h1);


		Object obj2 = new Object();
		int h2 = obj2.hashCode();
		System.out.println("h2 = "+h2);

		String str1 = obj1.toString();
		System.out.println(str1);

		System.out.println(obj1);

		boolean b1 = obj1.equals(obj2);
		System.out.println(b1);
	}
}