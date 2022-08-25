package dsa;
import java.util.*;
import java.io.*;
public class MaximumProductSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int minValue=arr[0];
		int maxValue=arr[0];
		int ans=arr[0];
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]<0)
			{
				int temp=maxValue;
				maxValue=minValue;
				minValue=temp;
			}
			
			maxValue=Math.max(arr[i], arr[i]*maxValue);
			minValue=Math.min(arr[i], arr[i]*minValue);
			
			ans=Math.max(ans, maxValue);
		}
		
		System.out.println(ans);
	}

}
