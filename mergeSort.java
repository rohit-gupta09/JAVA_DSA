package dsa_Practice;
import java.util.*;
public class mergeSort {
	
	public static void merge_sort(int[] arr,int low,int high)
	{	
		if(low<high)
		{
			int m=(low+high/2);
			
			merge_sort(arr,low,m);
			merge_sort(arr,m+1,high);
			
			mergedArray(arr,low,m,high);
			
		}
	}
	
	public static void mergedArray(int[] arr,int p, int q,int r)
	{
		
		int x=q-p+1;
		int y=r-q;
		
		int a[]=new int[x];
		int b[]=new int[y];
		
		for(int i=0;i<x;i++)
		{
			a[i]=arr[p+i];
		}
		
		for(int j=0;j<y;j++)
		{
			b[j]=arr[q+1+j];
		}
		
		int i=0;
		int j=0;
		int k=p;
		
		while(i<x && j<y){
			if(a[i]<=b[j])
			{
				arr[k]=a[i];
				i++;
				k++;
			}
			else {
				arr[k]=b[j];
				j++;
				k++;
			}
		}
		
		while(i<x)
		{
			arr[k]=a[i];
			i++;
			k++; 
		}
		
		while(j<y)
		{
			arr[k]=b[j];
			j++;
			k++;
		}
	}
	
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
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
		merge_sort(arr,0,arr.length-1);
		
		printArray(arr);

	}

}
