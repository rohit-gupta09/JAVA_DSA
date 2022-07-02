package hackerRank;
import java.util.*;
import java.io.*;
public class NaiveMatching {

	static void search(String txt,String pat)
	{
		int l1=txt.length();
		int l2=pat.length();
		int i=0;
		int j=l2-1;
		for(i=0,j=l2-1;j<l1;)
		{
			if(pat.equals(txt.substring(i, j+1)))
			{
				System.out.println("Pattern found at "+i);
			}
			i++;
			j++;
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String txt=sc.next();
		String patt=sc.next();
		
		search(txt,patt);
	}

}
