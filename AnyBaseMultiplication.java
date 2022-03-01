package dsa_Practice;
import java.util.*;

public class AnyBaseMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int d=getroduct(b,n1,n2);
		System.out.println(d);

	}
	public static int getProductWithSingleDigit(int base,int n1,int d2)
	{
		int result=0;
		int c=0;
		int p=1;
		while(n1>0 || c>0)
		{
			int d1=n1%10;
			n1=n1/10;
			
			int d=(d1 * d2) + c;
			
			c=d/base;
			d=d/base;
			
			result=result+d*p;
			p = p *10;
		}
		return result;
	}
	public static int getsum(int n1,int n2,int base)
	{
		int result=0;
		int c=0;
		int p=1;
		while(n1>0 || n2>0 || c>0)
		{
			int d1=n1%10;
			int d2=n2%10;
			n1=n1/10;
			n2=n2/10;
			
			int d=d1+d2+c;
			c=d/base;
			d=d%base;
			
			result=result+(d*p);
			p=p*10;
		}
		return result;
	}
	
	public static int getroduct(int b,int n1,int n2)
	{
		int result=0;
		int p=1;
		while(n2>0)
		{
			int d2=n2%10;
			n2=n2/10;
			int sprd=getProductWithSingleDigit(b, n1, d2);
			result=getsum(b, result, sprd*p);
			p=p*10;
			
		}
		return result;
		
	}

}
