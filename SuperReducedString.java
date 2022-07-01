//hackerRank Question --> super reduced String
package lovebabber;
import java.util.*;
import java.io.*;
public class SuperReducedString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		StringBuffer s=new StringBuffer(str);
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				s.delete(i-1, i+1);
				i=0;
			}
		}
		if(s.length()==0)
		{
			System.out.println("Empty String");
		}
		else {
			System.out.println(s);
		}
	}

}
