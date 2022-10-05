package rescursion;
import java.util.*;
import java.io.*;
public class RemoveChar {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		Remove("",st);
	}
	
	static void Remove(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		if(ch=='a')
		{
			Remove(p,up.substring(1));
		}
		else {
			Remove(p+ch,up.substring(1));
		}
	}
}
