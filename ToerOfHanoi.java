package rescursion;

public class ToerOfHanoi {

	public static void main(String[] args) {
		int n=3;
		tower(n,'a','c','b');

	}
	
	static void tower(int n,char from_rod,char to_rod,char aux_rod)
	{
		if(n==0)
		{
			return;
		}
		
		tower(n-1,from_rod,aux_rod,to_rod);
		System.out.println("MOve disk "+n+" from rod "+from_rod+" to "+to_rod );
		tower(n-1,aux_rod,to_rod,from_rod);
	}

}
