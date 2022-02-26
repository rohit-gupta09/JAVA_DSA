package dsa_Practice;
import java.util.*;
import java.io.*;

public class Partionaning_Array {
	
	public static void partion(int[] arr,int p)
	{
		
		int i=0;
		int j=0;
		
		while(i<arr.length)
		{
			if(arr[i]>p)
			{
				i++;
			}
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		
	}
	
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]=new int[] {7,9,4,8,3,6,2,1};
		partion(arr,5);
		printArray(arr);
	}

}
