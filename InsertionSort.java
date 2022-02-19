package dsa_Practice;
import java.util.*;

public class InsertionSort {
	
	public static void insertionSort(int[] arr)
	{
	                                                   
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i;j>=0;j--)
			{
				if(isSmaller(arr, j+1, j)) {
					swap(arr,j+1,j);
				}
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static boolean isSmaller(int[] arr,int i,int j)
	{
		if(arr[i]<arr[j])
		{
			return true; 
		}
		else {
			return false; 
		}
	}
	
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		insertionSort(arr);

	}

}
