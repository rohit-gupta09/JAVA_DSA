//Hackerrank Question  --> Two strings
package hackerRank;
import java.util.*;
import java.io.*;

public class TwoStringd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		for(int i=0;i<n;i++)
//		{
//			String str1=sc.next();
//			String str2=sc.next();
//			int count=0;
//		
//			for(int j=0;j<str1.length();j++)
//			{
//				char x=str1.charAt(j);
//				String s = "" + x; // convert char to string
//				if(str2.contains(s))
//				{
//					count=count+1;
//				}
//			}
//			
//			if(count==0)
//			{
//				System.out.println("NO");
//			}
//			else {
//				System.out.println("YES");
//			}
//		}
		
		// more optimzed solution
        while(n!=0){
        String res="NO";
        String s="";
         String str1=sc.next();
            String str2=sc.next();
        for(int i=97;i<122;i++)
        {
           
            
            if(str1.contains((char)i+s)&&str2.contains((char)i+s))
            {
                res="YES";
                break;
            }
        }
        System.out.println(res);
        n--;
    }
		
	}

}
