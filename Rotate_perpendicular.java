package twoD_Array;
import java.util.*;

public class Rotate_perpendicular {
	
	public static void rotate(int[][] arr,int a,int b)
	{
		// first we do transpose of the 2-d matrix and then the resultant row of matrix
		for(int i=0;i<a;i++)
		{
			for(int j=i;j<b;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}


		// reverse the rows
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<(b/2);j++)
			{
				int temp=arr[i][j];       
				arr[i][j]=arr[i][b-j-1];
				arr[i][b-j-1]=temp;
			}
		}
		System.out.println("Resultant Matrix\n");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[][] arr=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		rotate(arr,a,b);
	}

}
