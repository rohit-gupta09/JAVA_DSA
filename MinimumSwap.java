package dsa;
import java.util.*;
import java.io.*;
public class MinimumSwap {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		
		int a=0;
	
		for(int i=0;i<n;i++)
		{
			if(arr1[i]<=k)
			{
				a++;
			}
		}
		int b=0;
		for(int i=0;i<a;i++)
		{
			if(arr1[i]>k)
			{
				b++;
			}
		}
		
		int c=b;
		for(int i=0,j=a;j<n;j++,i++)
		{
			if(arr1[i]>k) {
				b--;
			}
			if(arr1[j]>k)
			{
				b++;
			}
			c=Math.min(c, b);
		}
		
		System.out.println(c);
		
	}

}
