package dsa_Practice;

import java.util.Scanner;

public class RadixSort {
	
	public static void radixSort(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int val:arr)
		{
			if(val>max)
			{
				max=val;
			}
		}
		int exp=1;
		while(exp<=max)
		{
			countSort(arr,exp);
			exp=exp*10;
		}
	}

	public static void countSort(int[] arr,int exp)
	{
		int[] ans=new int[arr.length];
		int[] freq=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			freq[arr[i] / exp % 10]++;
		}
		
		for(int i=1;i<freq.length;i++)
		{
			freq[i]=freq[i]+freq[i-1];
		}
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			int position=freq[arr[i] / exp % 10]-1;
			ans[position]=arr[i];
			freq[arr[i] / exp % 10]--;
		}
		
		for(int i=0;i<ans.length;i++) {
			arr[i]=ans[i];
		}
	}
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int max=0;
		int min=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			max=Math.max(max, arr[i]);
			min=Math.min(max, arr[i]);
		}
		radixSort(arr);
		printarray(arr);
	}
}
