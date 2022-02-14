package twoD_Array;
import java.util.*;

public class Matrix_multiplication {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r1=3;
		int c1=2;
		
		int r2=2;
		int c2=3;
		int[][] a=new int[r1][c1];
		int[][] b=new int[r2][c2];
		System.out.println("ENter the element in second matrix");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("ENter the element in second matrix");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		if(c1 != r2)
		{
			System.out.println("Invalid Input");
		}
		
		int[][] c=new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
			   for(int k=0;k<c1;k++)
			   {
				   c[i][j]+=a[i][k]*b[k][j];
			   }
			}
		}
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
