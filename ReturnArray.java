package rescursion;
import java.util.*;
public class ReturnArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,4,8};
		int target=4;
		System.out.println(find(arr,0,target,new ArrayList<>()));
	}
	
	static ArrayList<Integer> find(int[] arr,int index,int target,ArrayList<Integer> al)
	{
		if(index==arr.length)
		{
			return al;
		}
		if(arr[index]==target)
		{
			al.add(index);
		}
		return find(arr,index+1,target,al);
	}

}
