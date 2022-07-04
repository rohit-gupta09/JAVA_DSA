package hackerRank;
import java.util.*;
import java.io.*;
public class Pangrams {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		System.out.println(str);
		str=str.toLowerCase();
//		System.out.println(str);
		str=str.replace(" ", "");
//		System.out.println(str);
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		if(set.size()!=26)
		{
			System.out.println("not pangram");
		}
		else {
			System.out.println("pangram");
		}
	}
}
