//Find the Union and Intersection of the two sorted arrays.


// solution  >>>>  first compare the elements of two arrays and print it which is smaller and then print all the left elements
//  tok this we use two pointers ; first one is in array 1 and another one is in array2

package lovebabber;
import java.util.*;
import java.io.*;
public class Question6 {
	
	static void union(int a[],int b[])
	{
		int i=0;
		int j=0;
		int x=a.length;
		int y=b.length;
		
		while(i<x && j<y)
		{
			if(a[i]>b[j])
			{
				System.out.print(b[j]+" ");
				j++;
			}
			else if(a[i]<b[j])
			{
				System.out.print(a[i]+" ");
				i++;
			}
			else {
				System.out.print(a[i]+" ");
				j++;
				i++;
			}
		}
		while(i<x)
		{
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<y)
		{
			System.out.print(b[j]+" ");
			j++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int b[]=new int[n];
		
		for(int j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		
		union(a,b);

	}

}
