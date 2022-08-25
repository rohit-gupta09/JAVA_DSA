package dsa;
import java.util.*;
import java.io.*;
public class LongestRepeatingSubsequence {

	static HashMap<String,Integer> al=new HashMap<>() ;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		subSequence(str,"");
		
		System.out.println(al);
		

	}
	static void subSequence(String str,String ans)
	{
		if(str.length()==0)
		{
			if(!al.containsKey(ans))
			{
				al.put(ans,1);
			}
			else {
				int count=al.get(ans);
				al.put(ans,count+1);
			}
			return;
		}
		
		subSequence(str.substring(1), ans+str.charAt(0));
		subSequence(str.substring(1), ans);
	}

}
