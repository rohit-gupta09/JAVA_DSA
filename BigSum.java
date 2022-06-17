// A very big sum problem of Hackerrank
// https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

package lovebabber;
import java.util.*;
import java.io.*;
public class BigSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		long sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println(sum);

	}

}
