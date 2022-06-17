// Plus Minus Problem of Hackerrank

package lovebabber;
import java.util.*;
import java.io.*;
public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//size of the array
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int count1=0; // for negative values
		int count2=0; // for 0
		int count3=0; // for positives
		for(int j=0;j<n;j++) {
			if(arr[j]<0)
			{
				count1=count1+1;
			}
			else if(arr[j]==0)
			{
				count2=count2+1;
			}
			else {
				count3=count3+1;
			}
		}
		
		System.out.printf("%6f%n",(float)(count3)/(float)(n));
		System.out.println((float)(count1/n));
		System.out.println((float)(count2/n));
	}

}
