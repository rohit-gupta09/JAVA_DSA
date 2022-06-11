//Count inverssion

package lovebabber;
import java.util.*;
import java.io.*;

public class Question16 {
	
	public static void countinversion(int nums[],int n)
	{
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(nums[j]<nums[i])
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static void swap(int nums[],int i,int j)
	{
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		countinversion(a,n);

	}

}
