// Kadane's algorithm
// used for finding maximum subcontiguous arra

package lovebabber;
import java.util.*;
import java.io.*;
public class Question13 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		// algo
		long max=a[0];
		long sum=a[0];
		
		for(int i=1;i<n;i++)
		{
			sum=sum+a[i];
			
			if(sum<a[i])
			{
				sum=a[i];
			}
			
			if(sum>max)
			{
				max=sum;
			}
		}
		
		System.out.println(max);
	}
}
