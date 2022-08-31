package dsa;
import java.util.*;
import java.io.*;

public class WordWrap {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		int k=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int sum=ar[i];
			for(int j=i+1;j<n;j++)
			{
				
				if((sum+1+ar[j])<k) {
					sum=sum+1+ar[j];
				}
				else {
					al.add((k-sum));
					break;
				}
			}
		}
		int result=0;
		for(int i=0;i<al.size();i++)
		{
			result=result+((al.get(i))*(al.get(i)));
		}
		System.out.println(result);
	}

}
