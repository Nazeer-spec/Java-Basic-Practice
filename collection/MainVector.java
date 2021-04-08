//Example for Vector List of Java Collection Framework 

import java.util.Vector;
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
class MainVector
{
	public static void showCartDetails(Vector cart) 
	{
	for(int index=0;index<cart.size();index++)
	{
		System.out.println(cart.get(index));
	}	
	}

	public static void main(String[] args) 
	{
		
		Vector cart=new Vector();
		cart.add(new Book("GOT","MJ",100));
		cart.add(new Mobile("MI","Note4",10000));
		cart.add(new Book("TOH","AJ",500));
		cart.add(new Book("MI","Note5Pro",13000));
		showCartDetails(cart);
		
	}
}