package backtracking;
import java.util.*;
public class MazeObstacle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
//		int r=sc.nextInt();
//		int c=sc.nextInt();
		boolean[][] board={
			{true,true,true},
			{true,false,true},
			{true,true,true}
		};
		path("",board,0,0);
		
	}
	
	static void path(String p,boolean maze[][],int r, int c)
	{
		if(r==maze.length-1 && c==maze[0].length-1)
		{
			System.out.println(p);
			return;
		}
		
		if(!maze[r][c])
		{
			return;
		}
		if(r<maze.length-1)
		{
			path(p+'D',maze,r+1,c);
		}
		if(c<maze[0].length-1)
		{
			path(p+'R',maze,r,c+1);
		}
	}

}
