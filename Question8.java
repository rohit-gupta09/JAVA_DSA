
//Given an array Arr[] of N integers.
//Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
package lovebabber;
import java.util.*;
import java.io.*;

public class Question8 {
	
	static long maxSubarray(int arr[], int n)
	{
		long max=arr[0];
		long sum=arr[0];
		for(int i=1;i<n;i++)
		{
			sum=sum+arr[i];
			if(sum<arr[i])
			{
				sum=arr[i];
			}
			
			if(sum>max)
			{
				max=sum;
			}
		}
		return max;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		long x=maxSubarray(arr,n);
		System.out.println(x);
	}
}
