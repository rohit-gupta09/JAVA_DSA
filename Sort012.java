package dsa_Practice;
import java.util.*;
public class Sort012 {
	
	public static void sort012(int[] arr)
	{
		int i=0;
		int j=0;
		int k=arr.length-1;
		
		while(i<=k)
		{
			if(arr[i]==1)
			{
				i++;
			}
			else if(arr[i]==2)
			{
				swap(arr,i,k);
				k--;
			}
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		
	}
	
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
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
		sort012(arr);
		printArray(arr);
	}

}
