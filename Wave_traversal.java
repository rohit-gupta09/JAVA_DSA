package twoD_Array;
import java.util.*;
public class Wave_traversal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int[][] arr=new int[r][c];
		System.out.println("Enter the elements in a matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Printing after wave traversal");
		
		for(int i=0;i<c;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<r;j++)
				{
					System.out.println(arr[j][i]);
				}
			}else {
				for(int j=r-1;j>=0;j--)
				{
					System.out.println(arr[j][i]);
				}
			}
		}
	}

}
