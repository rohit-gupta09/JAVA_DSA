package hackerRank;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        for(int i=0;i<testcases;i++)
        {
            int n=sc.nextInt();
            LinkedList<Integer> l1=new LinkedList<Integer>();
            LinkedList<Integer> l2=new LinkedList<Integer>();
            for(int j=0;j<n;j++)
            {
                int val=sc.nextInt();
                l1.add(val);
            }
            l2.add(l1.get(0));
            for(int j=1;j<n;j++)
            {
                if(l1.get(j)!=l1.get(j-1))
                {
                    l2.add(l1.get(j));
                }
                else {
                	continue;
                }
            }
            System.out.println(l2);
             
        }

	}

}
