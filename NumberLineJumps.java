// HackerRank problem NumberLine jumps
// https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=false&h_r=next-challenge&h_v=zen


package lovebabber;
import java.util.*;
import java.io.*;
public class NumberLineJumps {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x1=sc.nextInt();
		int v1=sc.nextInt();
		int x2=sc.nextInt();
		int v2=sc.nextInt();
		
		int v=v1-v2;
		if(v<=0)
		{
			System.out.println("NO");
		}
		else {
			int x=x1-x2;
			if(x%v==0)
			{
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}

}
