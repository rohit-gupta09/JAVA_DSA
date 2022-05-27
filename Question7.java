//Write a program to cyclically rotate an array by one.
package lovebabber;
import java.util.*;
import java.io.*;
public class Question7 {
	
	static void rotate(int arr[],int n)
	{
		int x=arr[n-1];
		for(int i=n-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
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
		
		rotate(arr,n);
	}

}
