package twoD_Array;

import java.util.Scanner;

public class Right_rotation {

	public static void rightrotation(int[] arr,int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			int index=(5-n+i)%arr.length;  // 4=1  2->3
			System.out.print(arr[index]+" ");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();// taking the size of the array
		int n=sc.nextInt();// taking the no of time you want right rotation
		int[] arr=new int[m];
		
		for(int i=0;i<m;i++)
		{
			arr[i]=sc.nextInt();
		}
		rightrotation(arr,n);

	}

}
