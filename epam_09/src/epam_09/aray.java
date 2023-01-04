package epam_09;
import java.util.*;
public class aray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        System.out.println(a.length);
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {                                                                                                           
        	System.out.println(a[i]);
        }
        System.arraycopy(a, 0, b, 0, n);
        for(int i=0;i<n;i++)
        {
        	System.out.println(b[i]);
        }
        for(int ele:b)
        {
        	System.out.println(ele);        	
        }
        System.out.println("min and max are");
        System.out.println(a[0]);
        System.out.println(a[n-1]);
        //binarySearch
        System.out.println(Arrays.binarySearch(a, 8));
        //remove duplicates
        
        
	}

}
