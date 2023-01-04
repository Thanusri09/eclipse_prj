package epam_09;

public class fruit {
	void eat()
	{
		System.out.println("name and taste");
	}
}
class apple extends fruit{
	void eat()
	{
		System.out.println("Apple"+" "+"sour");	
	}
	
}
class orange extends fruit{
	void eat()
	{
	    System.out.println("Orange"+" "+"Pulpy");	
	}
}
