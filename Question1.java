package lovebabber;
import java.util.*;

public class Question1 {
	
	
	static void reverse(int a[],int size)
	{
		int start=0;
		int end=size-1;
		while(start<end) {
			int temp;
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		reverse(a,n);
		
	}

}
