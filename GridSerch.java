//HackerRank Question --> The Grid Search;
package lovebabber;
import java.util.*;
public class GridSerch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int R=sc.nextInt();
			int C=sc.nextInt();
			String arr1[]=new String[R];// Grid Array
			for(int j=0;j<R;j++)
			{
				arr1[j]=sc.next();
			}
			
			int r=sc.nextInt();
			int c=sc.nextInt();
			String arr2[]=new String[r]; // Pattern Array
			for(int a=0;a<r;a++)
			{
				arr2[a]=sc.next();
			}
			
			boolean exist=false;
			for(int a=0;a<R-r+1;a++)
			{
				for(int b=0;b<C-c+1;b++)
				{
					if(arr1[a].charAt(b)==arr2[0].charAt(0))
					{
						for(int j=0;j<r;j++)
						{
							for(int k=0;k<c;k++)
							{
								if(arr2[j].charAt(k)!=arr1[j+a].charAt(k+b))
								{
									exist=false;
									break;
								}
								else {
									exist=true;
								}
							}
							if(exist==false)
							{
								break;
							}
						}
						if(exist==true)
						{
							break;
						}
					}
					if(exist==true)
					{
						break;
					}
				}
			}
			
			if(exist==true)
			{
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
