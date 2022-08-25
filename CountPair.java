package dsa;
import java.util.*;
import java.io.*;
public class CountPair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a1[]=new int[N];
		for(int i=0;i<N;i++)
		{
			a1[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		
		HashMap<Integer,Integer> m=new HashMap<>();
		int count=0;
		for(int i=0;i<N;i++)
		{
			if(m.containsKey(k-a1[i]))
			{
				count +=m.get(k-a1[i]);
			}
			
			if(m.containsKey(a1[i]))
			{
				m.put(a1[i], m.get(a1[i])+1);
			}
			else {
				m.put(a1[i], 1);
			}
		}
		
		System.out.println(count);
		
	}

}
