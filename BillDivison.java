// Hackerrank Quesetion --> Bill Divison

package lovebabber;
import java.util.*;
import java.io.*;
public class BillDivison {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int b=sc.nextInt();  // charged amount
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		sum=sum-arr[k];
		int avg_actual=sum/2; // actual amount ana have to pay
		
		if(b==avg_actual) {
			System.out.println("Bon Appetit");
		}
		else {
			int extra=b-avg_actual;
			System.out.println(extra);
		}
		
		
	}

}
