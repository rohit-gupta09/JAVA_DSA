package backtracking;
import java.util.*;
public class Maze {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		
//		System.out.println(count(r,c));
//		path("",r,c);
		pathDiagonal("",r,c);
	}
	
	static int count(int r,int c)
	{
		if(r==1 || c==1)
		{
			return 1;
		}
		
		int left=count(r-1,c);
		
		int right=count(r,c-1);
		
		return left+right;
	}
	
	static void path(String p,int r,int c)
	{
		if(r==1 && c==1)
		{
			System.out.println(p);
			return;
		}
		
		if(r>1)
		{
			path(p+'D',r-1,c);
		}
		
		if(c>1)
		{
			path(p+'R',r,c-1);
		}
	}
	
	static void pathDiagonal(String p,int r,int c)
	{
		if(r==1 && c==1)
		{
			System.out.println(p);
			return;
		}
		
		if(r>1)
		{
			pathDiagonal(p+'D',r-1,c);
		}
		
		if(c>1)
		{
			pathDiagonal(p+'R',r,c-1);
		}
		
		if(r>1 && c>1)
		{
			pathDiagonal(p+'d',r-1,c-1);
		}

	}
}
