public class Is_Unique {
	public static boolean isUniqueChars(String str)
	{
		if(str.length()>128)
		{
			return false;
		}
		boolean[] char_set = new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i);
			if(char_set[val])
			{
				return false;
			}
			char_set[val]=true;
		}
		return true;
	}
	
	public static boolean isUniqueChars2(String str)
	{
		if(str.length()>26)
		{
			return false;
		}
		
		int checker =0;
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i)-'a';
			if((checker&(1<<val))>0)
			{
				return false;
			}
			checker|=(1<<val);
