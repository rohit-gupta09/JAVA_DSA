package dsa;
import java.util.*;
import java.io.*;
public class SubSequence {
	
	static ArrayList<String> al=new ArrayList<>();
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		subSequence(str,"");
		
		System.out.println(al);
	}
	
	static void subSequence(String str,String ans)
	{
		if(str.length()==0)
		{
			al.add(ans);
			return;
		}
		
		subSequence(str.substring(1), ans+str.charAt(0));
		subSequence(str.substring(1), ans);
	}
}
