package dsa_Practice;
import java.io.*;
import java.util.*;

public class CountSort {
	
	public static void countSort(int[] arr,int min,int max)
	{
		int range=max-min+1;
		int[] freq=new int[range];
		
		for(int i=0;i<arr.length;i++)
		{
			int index=arr[i]-min;
			freq[index]++;
		}
		
		for(int i=1;i<freq.length;i++)
		{
			freq[i]=freq[i]+freq[i-1];
		}
		
		int[] ans=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			int val=arr[i];
			int position=freq[val-min];
			int index=position-1;
			ans[index]=val;
			freq[val-min]--;
		}
		
		for(int i=0;i<ans.length;i++) {
			arr[i]=ans[i];
		}
	}
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
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
		countSort(arr,min,max);
		printarray(arr);
	}

}
