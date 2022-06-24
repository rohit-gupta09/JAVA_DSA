package lovebabber;
import java.util.*;
import java.io.*;
public class SalesbyMatch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int pair=0;
		
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			if(!set.contains(arr[i]))
			{
				set.add(arr[i]);
			}
			else
			{
				pair=pair+1;
				set.remove(arr[i]);
			}
		}
		
		System.out.println(pair);
			
		
	}

}
