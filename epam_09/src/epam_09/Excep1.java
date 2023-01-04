package epam_09;
import java.util.*;
public class Excep1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
				//throw new ArithmeticException();
			int c=a/b;

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
