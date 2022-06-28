package lovebabber;
import java.util.*;
import java.io.*;
public class CamelCase {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(65<=str.charAt(i) && str.charAt(i)<=90)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
