// next permutation 

package lovebabber;
import java.util.*;
import java.io.*;
public class Question15 {
	
	static void nextPermutation(int nums[])
	{
		int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j=nums.length-1;
            while(nums[j]<=nums[i])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
	}
	
	public static void swap(int nums[],int i,int j)
	{
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	public static void reverse(int nums[],int i)
	{
		int j=i;
		int n=nums.length-1;
		while(j<n)
		{
			swap(nums,j,n);
			j++;
			n--;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=1;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		nextPermutation(arr);

	}

}
