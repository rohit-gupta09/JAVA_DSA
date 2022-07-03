// leetocode question --> Count and say

package hackerRank;
import java.util.*;
import java.io.*;
public class CountSay {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String result="1";
		if(n==1)
		{
			System.out.println(result);
		}
		else {
			int i=1;
			while(i<n)
			{
				StringBuilder sb=new StringBuilder();
				int count=1;
				for(int j=1;j<result.length();j++)
				{
					if(result.charAt(j)==result.charAt(j-1))
					{
						count=count+1;
					}
					else {
						sb.append(count);
						sb.append(result.charAt(j-1));
						count=1;
					}
				}
				
				sb.append(count);
				sb.append(result.charAt(result.length()-1));
				result=sb.toString();
				
				i++;
				
			}
		}
		System.out.println(result);
	}
	

}
