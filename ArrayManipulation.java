package lovebabber;
import java.util.*;
import java.io.*;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int m=sc.nextInt();
		int i=0;
		while(i<n)
		{
			arr[i]=0;
			i++;
		}
		
		for(int j=0;j<m;j++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int k=sc.nextInt();
			
			for(int x=a-1;x<=b-1;x++)
			{
				arr[x] +=k;
			}
		}
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}

}
