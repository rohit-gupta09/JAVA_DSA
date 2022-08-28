package dsa;
import java.util.*;
import java.io.*;
public class AllPermuation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length()-1;
		permuatation(str, 0, n);

	}
	
	static void permuatation(String str,int l,int r)
	{
		if(l==r)
		{
			System.out.println(str);
		}
		else {
			for(int i=l;i<=r;i++)
			{
				str=swap(str,l,i);
				permuatation(str, l+1, r);
				str=swap(str,l,i);
			}
		}
	}
	
	static String swap(String str,int a,int b)
	{
		char[] ar=str.toCharArray();
		char temp;
		temp=ar[a];
		ar[a]=ar[b];
		ar[b]=temp;
		
		return String.valueOf(ar);
	}

}
