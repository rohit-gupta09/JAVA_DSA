package dsa_Practice;
import java.util.*;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int space=1;space<=n-i;space++)
			{
				System.out.print("  ");
			}
			
			for(int j=3+i;j>=5-i;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
