//Gfg Question -->  In a given string, find the first leftmost non-repeated element;
package hackerRank;
import java.util.*;
import java.io.*;
public class LeftmostNonRepeated {
	static int CHARS=256;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count[]=new int[CHARS];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		int index=-1;
		for(int i=0;i<str.length();i++)
		{
			if(count[str.charAt(i)]==1)
			{
				index=i;
				break;
			}
		}
		if(index==-1)
		{
			System.out.println("Non Repeating element exist");
		}
		else {
			System.out.println("Leftmost reapeating Element "+str.charAt(index));
		}
	}

}
