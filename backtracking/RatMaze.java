package backtracking;
import java.util.*;
public class RatMaze {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]= {
				{1,0,0,0},
				{1,1,0,1},
				{1,1,0,0},
				{0,1,1,1}
		};
		
		path("",a,0,0);
		
	}
	
	static void path(String p,int[][] a,int r,int c)
	{
		if(r==a.length-1 && c==a[0].length-1)
		{
			System.out.println(p);
			return;
		}
		
		if(a[r][c]==0)
		{
			return;
		}
		if(r<a.length-1)
		{
			path(p+'D',a,r+1,c);
		}
		
		if(c<a[0].length-1)
		{
			path(p+'R',a,r,c+1);
		}
	}

}
