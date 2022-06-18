// HackerRank problem : APPLE & ORANGE
// https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true


package lovebabber;
import java.util.*;
public class AppleOrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int arr1[]=new int[m];
		
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		int arr2[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int count1=0;
		
		for(int i=0;i<m;i++)
		{
			arr1[i]=arr1[i]+a;
			if(s<=arr1[i] && arr1[i]<=t)
			{
				count1=count1+1;
				
			}
		}
		int count2=0;
		for(int i=0;i<n;i++)
		{
			arr2[i]=arr2[i]+b;
			if(s<=arr2[i] && arr2[i]<=t)
			{
				count2=count2+1;
				
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		
		sc.close();

	}

}
