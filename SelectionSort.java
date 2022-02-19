package dsa_Practice;
import java.util.*;

public class SelectionSort {
	
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(isSmaller(arr, j, min)) {
					min=j;
				}
			}
			swap(arr,min,i);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static boolean isSmaller(int[] arr,int i,int j)
	{
		if(arr[i]<arr[j]) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void swap(int[] arr, int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		selectionSort(arr);

	}

}
