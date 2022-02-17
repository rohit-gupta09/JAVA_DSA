package twoD_Array;
import java.util.*;

public class Saddle_Point {
	
	public static void saddle(int[][] arr,int a ,int b)
	{
		for(int i=0;i<a;i++)
		{
			int svj=0;
			for(int j=1;j<b;j++)
			{
				if(arr[i][j]<arr[i][svj])
				{
					svj=j;
				}
			}
			
			boolean flag=true;
			
			for(int k=0;k<a;k++)
			{
				if(arr[k][svj]>arr[i][svj])
				{
					flag=false;
					break;
				}
			}
			
			if(flag==true)
			{
				System.out.println(arr[i][svj]);
				return;
			}
		}
		System.out.println("Invlaid Input");
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
		
		saddle(arr,a,b);
		

	}

}
