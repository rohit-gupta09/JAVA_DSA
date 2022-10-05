package rescursion;

public class SkipString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		skip("","bccapplea");

	}
	
	static void skip(String p,String up)
	{
		
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		} 
		if(up.startsWith("apple"))
		{
			skip(p,up.substring(5));
		}
		else {
			skip(p+up.charAt(0),up.substring(1));
		}
	}
}
