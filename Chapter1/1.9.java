
public class isRotation
{
	public static boolean isSubstring(String big,String sml)
	{
		if(big.indexOf(sml)>=0)
			return true;
		else
			return false;
	}
	
	public static boolean isRotation(String s1,String s2)
	{
		if(s1.length()==s2.length()&&s1.length()!=0)
		{
			String s1s1=s1+s1;
			return(isSubstring(s1s1,s2));
		}
		return false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1="abcd",s2="dabc";
		System.out.println(isRotation(s1,s2));
	}

}
