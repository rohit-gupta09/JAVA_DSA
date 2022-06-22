//  HackerRank problem Minimum loss
package lovebabber;
import java.util.*;
import java.io.*;
public class MinimumLoss {
	
	public static void Loss(long arr[])
	{
		long min=Integer.MAX_VALUE;
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				long loss=0;
				loss=arr[i]-arr[j];
				if(loss>=0)
				{
					if(loss<min)
					{
						min=loss;
					}
					
				}
//				else {
//					continue;
//				}
//				
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Loss(arr);
	}

}
