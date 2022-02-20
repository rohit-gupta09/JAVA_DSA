package dsa_Practice;
import java.io.*;
import java.util.*;

public class QuickSelect {

  public static int quickSelect(int[] arr, int lo, int hi, int k) {
    
	  int pivot=arr[hi];
	  int pi=partition(arr,pivot,lo,hi);
	  
	  if(k<pi)
	  {
		  return quickSelect(arr,lo,pi-1,k);
	  }
	  else if(k>pi)
	  {
		  return quickSelect(arr,pi+1,hi,k);
	  }
	  else {
		  return pivot;
	  }
	  
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    return (j - 1);
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    System.out.println(quickSelect(arr,0,arr.length - 1,k - 1));
  }

}