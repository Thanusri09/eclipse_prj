package epam_09;
import java.util.*;
public class electronic_watch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sec:");
		long sec=sc.nextLong();
		long hrs=(sec/3600);
		sec=sec-hrs*3600;
		long min=sec/60;
		sec=sec-min*60;
		System.out.println(hrs%24+":"+min+":"+sec);
	    System.out.printf(hrs+":"+String.format("%02d", min)+":"+String.format("%02d", sec));
		
	}
}
