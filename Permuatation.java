package rescursion;
import java.util.*;
import java.io.*;
public class Permuatation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		permt("",st);
	}
	
	static void permt(String p,String st)
	{
		if(st.isEmpty())
		{
			System.out.println(p);
			return;
		}
		
		char ch=st.charAt(0);
		for(int i=0;i<=p.length();i++)
		{
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			permt(f+ch+s,st.substring(1));
		}
	}

}
