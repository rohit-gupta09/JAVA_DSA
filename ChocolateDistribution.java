package dsa;
import java.util.*;
import java.io.*;
public class ChocolateDistribution {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		Arrays.sort(arr1);
		
		int min=arr1[0];
		int x=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr1[i]>m)
			{
				x=Math.min(x,arr1[i]);
			}
		}
		
		System.out.println(x-min);
		
	}

}
