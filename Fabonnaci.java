package rescursion;
import java.util.*;
import java.io.*;
public class Fabonnaci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=fabonnaci(n);
		System.out.println(x);
	}
	
	static int fabonnaci(int n)
	{
		if(n<2)
		{
			return n;
		}
		else {
			return fabonnaci(n-1)+fabonnaci(n-2);
		}
	}

}
