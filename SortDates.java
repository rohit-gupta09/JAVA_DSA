package dsa_Practice;

import java.util.Scanner;

public class SortDates {
	
	public static void radixSort(String[] arr) {
		countSort(arr,1000000,100,32); //for day
		countSort(arr,10000,100,13); //for month
		countSort(arr,1,10000,2501); //for year
		
	}

	public static void countSort(String[] arr,int div,int mod,int range)
	{
		String[] ans=new String[arr.length];
		int[] freq=new int[range];
		
		for(int i=0;i<arr.length;i++)
		{
			freq[Integer.parseInt(arr[i],10) / div % mod]++;
		}
		
		for(int i=1;i<freq.length;i++)
		{
			freq[i]=freq[i]+freq[i-1];
		}
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			int position=freq[Integer.parseInt(arr[i],10) / div % mod]-1;
			ans[position]=arr[i];
			freq[Integer.parseInt(arr[i],10) / div % mod]--;
		}
		
		for(int i=0;i<ans.length;i++) {
			arr[i]=ans[i];
		}
	}
	public static void printarray(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			arr[i]=str;
		}
		radixSort(arr);
		printarray(arr);
	}

}
