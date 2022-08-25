package dsa;
import java.util.*;
import java.io.*;
public class BestTimeTOBuyAndSellStock {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int n=c.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=c.nextInt();
		}
		System.out.println(sellSTock(a));
	}
	
	static int sellSTock(int a[])
	{
		int maxprofit=0;
		int minPrice=a[0];
		for(int i=0;i<a.length;i++)
		{
			minPrice=Math.min(minPrice, a[i]);
			maxprofit=Math.max(maxprofit,a[i]-minPrice);
		}
		
		return maxprofit;
	}

}
