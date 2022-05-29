//find duplicate in an array of N+1 Integers

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

//There is only one repeated number in nums, return this repeated number.

//You must solve the problem without modifying the array nums and uses only constant extra space.

package lovebabber;
import java.util.*;
import java.io.*;
public class Question11 {
	
	static int duplicate(int num[])
	{
		Arrays.sort(num);
		int repeat=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==num[i+1])
			{
				repeat=num[i];
				break;
			}
		}
		return repeat;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		int x=duplicate(arr);
		System.out.println(x);
	}

}
