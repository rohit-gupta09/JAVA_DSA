package dsa;
import java.util.*;
import java.io.*;

//recurisve appproach

public class SumSubset{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> ans=new ArrayList();
		
		sumsubset(0,0,a,n,ans);
		
		Collections.sort(ans);
		
		for(int i=0;i<ans.size();i++)
		{
			System.out.println(" "+ans.get(i));
		}
	}
	
	
	static void sumsubset(int index,int sum,int a[],int n,ArrayList<Integer> ans)
	{
		if(index==n)
		{
			ans.add(sum);
			return;
		}
		
		// for considering
		sumsubset(index+1, sum+a[index], a, n, ans);
		
		// for not considering the element
		sumsubset(index+1,sum,a,n,ans);
	}
}

// iterative appproach
//public class SumSubset {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int a[]= new int[n];
//		for(int i=0;i<n;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		
//		subset(a,n);
//		
//	}
//	
//	static void subset(int a[],int n)
//	{
//		Vector<Integer> ans=new Vector();
//		ans.add(0);
//		for(int i=0;i<n;i++)
//		{
//			int v=ans.size();
//			for(int j=0;j<v;j++)
//			{
//				ans.add(ans.get(j)+a[i]);
//			}
//			
//		}
//		
//		for(int i=0;i<ans.size();i++)
//		{
//			System.out.println(ans.get(i)+" ");
//		}
//		
//	}
//
//}
