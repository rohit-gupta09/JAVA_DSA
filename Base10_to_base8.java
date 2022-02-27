package dsa_Practice;
import java.util.*;
public class Base10_to_base8 {
	
	public static void change(int n,int base) {
		int result=0;
		int power=1;
		while(n>0)
		{
			int a=0;
			a=n%base;
			n=n/base;			
			result=result + (a*power);
			power=power*10;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		change(n,b);

	}

}
