package dsa;
import java.util.*;
import java.io.*;
public class SplitBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		splitBinary(str);
	}
	
	static void splitBinary(String str) {
		char ar[]=str.toCharArray();
		int cnt=0;
		int count=0;
		int count1=0;
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[i]=='0')
			{
				count++;
			}
			else {
				count1++;
			}
			
			if(count1==count)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
