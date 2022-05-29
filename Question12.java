//Merge 2 sorted arrays without using Extra space.

package lovebabber;
import java.util.*;
import java.io.*;
public class Question12 {
	
	static void merge(int arr1[],int arr2[],int n,int m)
	{
		
		int arr[]=new int[m+n];
		int k=0;
		int i=0;
		int j=0;
		while(i<n && j<m)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr[k]=arr2[j];
				j++;
				k++;
			}
			
		}
		
		while(i<n)
		{
			arr[k]=arr1[i];
			k++;
			i++;
		}
		
		while(j<m)
		{
			arr[k]=arr2[j];
			k++;
			j++;
		}
		
		for(int l=0;l<arr.length;l++)
		{
			System.out.print(arr[l]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		int arr2[]=new int[m];
		for(int j=0;j<m;j++)
		{
			arr2[j]=sc.nextInt();
		}
		
		merge(arr1,arr2,n,m);
	}

}
