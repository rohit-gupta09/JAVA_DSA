// Check Palindrome

package hackerRank;
import java.util.*;
import java.io.*;
public class Paindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String n="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			n=ch+n;
		}
		if(n.equals(str))
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("NO");
		}
	}

}
