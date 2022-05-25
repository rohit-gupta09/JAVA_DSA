package lovebabber;
import java.util.*;
public class Question2 {

	static void getMaxMin(int a[],int n)
	{
		int max=0;
		int min=0;
		int start=0;
		int end=n-1;
		if(n==1)
		{
			min=max=a[0];
		}
		if(n==2)
		{
			if(a[start]>a[end])
			{
				max=a[start];
				min=a[end];
			}
			else {
				max=a[end];
				min=a[start];
			}
			
		}
		else {
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<n-1;j++)
				{
					if(a[j+1]<a[j])
					{
						int temp;
						temp=a[j+1];
						a[j+1]=a[j];
						a[j]=temp;
					}
				}
			}
			
			min=a[0];
			max=a[n-1];
		}
		
		System.out.println("Minimum value is : "+min);
		System.out.println("Maximum value is : "+max);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		getMaxMin(a,n);

	}

}
