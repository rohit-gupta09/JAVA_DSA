//Move all the negative elements to one side of the array 
package lovebabber;
import java.util.*;

public class Question5 {

	static void sortnegative(int a[],int n) {
		int i=0;
		int k=n-1;
		while(i<=k)
		{
			if(a[i]<0 && a[k]<0)
			{
				i++;
			}
			else if(a[i]>=0 && a[k]<0)
			{
				int temp;
				temp=a[i];
				a[i]=a[k];
				a[k]=temp;
				i++;
				k--;
			}
			else if(a[i]<0 && a[k]>=0)
			{
				i++;
				k--;
			}
			else {
				k--;
			}
		}
		
		for(int j=0;j<n;j++)
		{
			System.out.print(a[j]+" ");
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
		
		sortnegative(a,n);

	}

}
