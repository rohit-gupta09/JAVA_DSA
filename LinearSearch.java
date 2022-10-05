package rescursion;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int arr[]= {3,2,1,18,9};
		int target=9;
		System.out.println(search(arr,0,target));
		System.out.println(findIndex(arr,0,target));
	}
	
	static boolean search(int[] arr,int index,int target)
	{
		if(index==arr.length)
		{
			return false;
		}
		return arr[index]==target || search(arr,index+1,target);
	}
	
	static int findIndex(int[] arr,int index,int target)
	{
		if(index==arr.length)
		{
			return -1;
		}
		
		if(arr[index]==target)
		{
			return index;
		}
		else {
			return findIndex(arr,index+1,target);
		}
	}
}
