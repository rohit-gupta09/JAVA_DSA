// Question --> Given the string, Find the leftmost repaeated element 
package hackerRank;
import java.util.*;
import java.io.*;

public class LeftMostReapeat {

	static int CHARS=256;
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count[]=new int[CHARS];
		for(int i=0;i<count.length;i++)
		{
			count[i]=-1;
		}
		int result=Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++)
		{
			if(count[str.charAt(i)]==-1)
			{
				count[str.charAt(i)]=i;
			}
			else {
				result=Math.min(result, count[str.charAt(i)]);
			}
		}
		
		if(result==Integer.MAX_VALUE)
		{
			System.out.println("No Leftmost repeated exist");
		}
		else {
			System.out.println("Leftmost repeated elemet "+str.charAt(result));
		}
	}

}
