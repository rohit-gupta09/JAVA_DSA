package dsa_Practice;
import java.util.*;

public class TargetSumPair {
	
	public static void pair(int[] arr,int target)
	{
		Arrays.sort(arr);
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			if(arr[l]+arr[r]<target)
			{
				l++;
			}
			else if(arr[l]+arr[r]>target)
			{
				r--;
			}
			else {
				System.out.println(arr[l]+"   "+arr[r]);
				l++;
				r--;
			}
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
		int target=sc.nextInt();
		pair(arr,target);
	}

}
