package dsa_Practice;
import java.util.*;

public class MergedTwoSortedArray {
	
	public static void mergedArray(int[] a,int[] b)
	{
		int arr[]=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j])
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
		
		while(i<a.length)
		{
			arr[k]=a[i];
			i++;
			k++;
		}
		
		while(j<b.length)
		{
			arr[k]=b[j];
			j++;
			k++;
		}
		
		for(int l=0;l<arr.length;l++)
		{
			System.out.print(arr[l]+" ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int a[]=new int[x];
		for(int i=0;i<x;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int y=sc.nextInt();
		int b[]=new int[y];
		for(int j=0;j<y;j++)
		{
			b[j]=sc.nextInt();
		}
		
		mergedArray(a,b);

	}

}
