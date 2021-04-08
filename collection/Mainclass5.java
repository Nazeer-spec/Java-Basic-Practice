class Book
{
	String title;
	String author;
	double price;

	public Book(String title,String author, double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}

	@Override
	public String toString()
	{
		String info= title+" "+author+" "+price;
		return info;
	}
}
class Mobile
{
	String brand;
	String model;
	double price;

	public Mobile(String brand,String model, double price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}

	@Override
	public String toString()
	{
		String info= brand+" "+model+" "+price;
		return info;
	}
}
class Mainclass5
{	
	public static void showCartDetails(Object[] cart) 
	{
	for(int i=0;i<cart.length;i++)
		System.out.println(cart[i].toString());
		//System.out.println(cart[i]);
	}

	public static void main(String[] args) 
	{
		Object[] cart = new Object[4];

		cart[0]=new Book("GOT","Manoj",200);
		cart[1]=new Mobile("MI","Nazi",20000);
		cart[2]=new Book("FT","Santhosh",300);
		cart[3]=new Mobile("Oneplus","Nazeer",30000);

		showCartDetails(cart);
	}
}

