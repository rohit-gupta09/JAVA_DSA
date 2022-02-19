// here we apply the concept of partitioning in sorting then binary code
//.here we have to shift 0's in the left side or 1's in the right side
package dsa_Practice;
import java.util.*;

public class Sort01 {
	
	public static void sort01(int[] arr) {
		
		int i=0;
		int j=0;
		while(i<arr.length)
		{
			if(arr[i]==1)
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
			System.out.print(arr[i]);
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
		sort01(arr);
		printArray(arr);
		
	}

}
