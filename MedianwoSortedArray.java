package dsa;
import java.util.*;
import java.io.*;
public class MedianwoSortedArray {

	public static void main(String[] args) {
		
		int[] arr1= {-5,3,6,12,15};
		int[] arr2= {-12,-10,-6,-3,4,10};
		
		ArrayList<Integer> a=new ArrayList<Integer>(arr1.length+arr2.length);
		for(int i=0;i<arr1.length;i++)
		{
			a.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			a.add(arr2[i]);
		}
	
		Collections.sort(a);
		
		if(a.size()%2!=0)
		{
			int x=(a.size())/2;
			System.out.println(a.get(x));
		}
		else {
			int a1=a.size()/2;
			int a2=a.size()/2+1;
			int y=(a.get(a1)+a.get(a2))/2;
			System.out.println(y);
			
		}
		
	}

}
