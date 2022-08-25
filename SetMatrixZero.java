package dsa;
import java.util.*;
import java.io.*;
public class SetMatrixZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution{
	public void SetZeros(int[][] matrix)
	{
		
		
		Set<Integer> s1=new HashSet<Integer>();
        Set<Integer> s2=new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                 if(matrix[i][j]==0)
                 {
                     s1.add(i);
                     s2.add(j);
                 }
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(s1.contains(i)||s2.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        
        
//		for(int i=0;i<matrix.length;i++)
//		{
//			for(int j=0;j<matrix[0].length;j++)
//			{
//				if(matrix[i][j]==0)
//				{
//					// for upper row
//					int index=i-1;
//					while(index>=0)
//					{
//						if(matrix[index][j]!=0)
//						{
//							matrix[index][j]=-1;
//						}
//					
//						index--;
//					}
//					
//					//for lower row
//					index=i+1;
//					while(index<matrix.length)
//					{
//						if(matrix[index][j]!=0)
//						{
//							matrix[index][j]=-1;
//						}
//						
//						index++;
//					}
//					
//					//for right column
//					index=j+1;
//					while(index<matrix[0].length)
//					{
//						if(matrix[j][index]!=0)
//						{
//							matrix[j][index]=-1;
//						}
//						index++;
//					}
//					
//					index=j-1;
//					while(index>=0)
//					{
//						if(matrix[j][index]!=0)
//						{
//							matrix[j][index]=-1;
//						}
//						index--;
//					}
//					
//				}
//			}
//			
//		}
//		
//		for(int i=0;i<matrix.length;i++)
//		{
//			for(int j=0;j<matrix[0].length;j++)
//				
//			{
//				if(matrix[i][j]==-1)
//				{
//					matrix[i][j]=0;
//				}
//			}
//		}
	}
}