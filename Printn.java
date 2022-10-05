package rescursion;

public class Printn {

	public static void main(String[] args) {

		print(1);
	}
	
	static void print(int n)
	{
		
		if(n>5) {
			return;
		}
		
		System.out.println("Hello world");
		print(n+1);
		
		
	}

}
