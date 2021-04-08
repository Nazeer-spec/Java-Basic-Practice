import java.util.Arraylist;
class Naza
{
	public static void main(String[] args) {
		Arraylist a=new Arraylist();
a.add("hello");
a.add(new String("java"));
  
System.out.println(a.get(0));
String s=(String) a.get(0);
System.out.println(s.length());
	}
}