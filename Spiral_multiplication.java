package twoD_Array;

import java.util.Scanner;

public class Spiral_multiplication {
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
//		   minc      maxc
//	minr->  1 1 1 1 1 1
//			1 1 1 1 1 1
//			1 1 1 1 1 1
//	maxc->	1 1 1 1 1 1
		
		System.out.println("Printing after Spiral traversal");
		int minr=0;
		int minc=0;
		int maxr=r-1;
		int maxc=c-1;
		int total=r*c;
		int count=0;
		
		while(count<total) {
			for(int i=minr, j=minc;i<=maxr && count < total;i++)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
			
			for(int i=maxr, j=minc;j<=maxc && count < total;j++)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			
			maxr--;
			
			for(int i=maxr, j=maxc;i>=minr && count < total;i--)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			
			maxc--;
			
			for(int i=maxc, j=minr;i>=minc && count < total;i--)
			{
				System.out.println(arr[j][i]);
				count++;
			}
			minr++;
			
		}
		
	}

}
