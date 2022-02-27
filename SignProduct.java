package dsa_Practice;
import java.util.*;
public class SignProduct {
	public static void signCheck(int[] arr)
	{
		int result=1;
		for(int i=0;i<arr.length;i++)
		{
			result=result*arr[i];
		}
		if(result>0) {
			System.out.println("1");
		}
		else if(result<0) {
			System.out.println("-1");
		}
		else{
			System.out.println("0");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		signCheck(arr);

	}

}
