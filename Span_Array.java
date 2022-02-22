package dsa_Practice;
import java.util.*;

public class Span_Array {
	
	public static void span(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(isSmaller(arr,j+1,j))
				{
					swap(arr,j+1,j);
				}
			}
		}
		
		System.out.println(arr[arr.length-1]-arr[0]);
	}
	public static void swap(int[] arr,int i,int j)
	{
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public static boolean isSmaller(int[] arr,int i,int j)
	{
		if(arr[i]<arr[j])
		{
			return true;
		}else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		span(arr);
	}

}
