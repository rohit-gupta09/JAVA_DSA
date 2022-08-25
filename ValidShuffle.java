package dsa;
import java.util.*;
import java.io.*;
public class ValidShuffle {

	public static void main(String[] args) {
		String first = "x1";
	    String second = "Y2";
	    String[] results = {"1xY2", "Y1x2", "Y21xx"};
	
	    for(String res:results) {
	    	check(res,first,second);
	    }
	}
	
	static String sortString(String str)
	{
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		str=String.valueOf(ch);
		return str;
		
	}
	
	static void check(String res,String first, String second)
	{
		if(first.length()+second.length()==res.length())
		{
			String res1=first+second;
			res1=sortString(res1);
			System.out.println(res1);
			res=sortString(res);
			System.out.println(res);
			
			if(res1.equals(res))
			{
				System.out.println("True");
			}
			
			else {
				System.out.println("False");
			}
						
		}
		else {
			System.out.println("False");
		}
	}

}
