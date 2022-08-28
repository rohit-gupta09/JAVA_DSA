package dsa;
import java.util.*;
import java.io.*;

public class MergeInterval {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new  int[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		merge(a);
		System.out.println(a);

	}
	
	static int[][] merge(int [][] intervals)
	{
		Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));;
		LinkedList<int[]> merged=new LinkedList<>();
		for(int[] interval:intervals)
		{
			if(merged.isEmpty() || merged.getLast()[1]<interval[0]) {
				merged.add(interval);
			}
			else
			{
				merged.getLast()[1]=Math.max(merged.getLast()[1], interval[1]);
			}
		}
		return merged.toArray(new int[merged.size()][]);
	}

}
