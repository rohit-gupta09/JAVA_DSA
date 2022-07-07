package problemSolving;
import java.util.*;
public class HourGlass {

	public static void solution(int[][] arr)
	{
		int max=Integer.MIN_VALUE;
		int total=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				total=arr[i][j]+arr[i][j+1]+arr[i][j+2];
				total=total+arr[i+1][j+1]+(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
				if(total>max)
				{
					max=total;
				}
				else {
					max=max;
				}
			}
		}
		
		System.out.println(max);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[6][6];
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		solution(arr);

	}

}
