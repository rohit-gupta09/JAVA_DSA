package lovebabber;
import java.util.*;
import java.io.*;

public class CheckAnagram {
	
	static int CHARS=256;
	
	public static void checkAnagram(String str1,String str2)
	{
		int[] count=new int[CHARS];
		if(str1.length()!=str2.length())
		{
			System.out.println("Two strings are not anagram of each other");
		}
		else {
			boolean exist=false;
			for(int i=0;i<str1.length();i++)
			{
				count[str1.charAt(i)]++;
				count[str2.charAt(i)]--;
			}
			
			for(int i=0;i<CHARS;i++)
			{
				if(count[i]!=0)
				{
					exist=false;
					break;
				}
			
				else{
					exist=true;
				}
			}
			
			if(exist==false) {
				System.out.println("Not exist");
			}
			else {
				System.out.println("Exist");
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		checkAnagram(str1,str2);

	}

}
