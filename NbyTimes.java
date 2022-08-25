package dsa;
import java.util.*;
import java.io.*;
public class NbyTimes {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		
		int x=n/k;
		
		HashMap<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(!m.containsKey(arr1[i]))
			{
				m.put(arr1[i],1);
			}
			else
			{
				int count=m.get(arr1[i]);
				m.put(arr1[i], count+1);
			}
		}
		
		for(Map.Entry y:m.entrySet())
		{
			Integer temp=(Integer)y.getValue();
			if(temp>x)
			{
				System.out.println(y.getKey());
			}
			
		}
	}

}
