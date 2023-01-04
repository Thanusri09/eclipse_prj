package epam_09;
import java.util.*;
public class ArrayduplicateRemv {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before removing");
		Arrays.sort(a);
		for(int i:a)
		{
			System.out.println(i);
		}
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j]=a[n-1];
		System.out.println("After");
		for(int i:temp)
		{
			System.out.println(i);
		}

	}

}
