package rescursion;
import java.util.*;

class CheckingSorted {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,4,12,9,10};
		System.out.println(sorted(arr,0));
	}
	
	static boolean sorted(int[] arr,int index)
	{
		if(index==arr.length-1)
		{
			return true;
		}
		return arr[index]<arr[index+1] && sorted(arr,index+1);
	}
}
