// Birthday cake handles hackerrANK PROBLEMS
// https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true

package lovebabber;
import java.util.*;
import java.io.*;
public class BirthdayCandles {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int j=1;
		int max=arr[0];
		while(j<n)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
			j++;
		}
		
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(max==arr[i])
			{
				count=count+1;
			}
		}
		
		System.out.println(count);
	}

}
