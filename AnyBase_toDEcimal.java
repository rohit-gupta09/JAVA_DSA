package dsa_Practice;
import java.util.*;

public class AnyBase_toDEcimal {
	
	public static void change(int n,int base) {
		int result=0;
		int power=1;
		while(n>0)
		{
			int a=0;
			a=n%10;
			n=n/10;			
			result=result + (a * power);
			power=power*base;
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
