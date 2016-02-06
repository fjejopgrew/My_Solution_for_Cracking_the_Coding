
public class isCompression
{
	public static String isCompression(String str)
	{
		StringBuilder s=new StringBuilder();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			count++;
			if(i+1>=str.length()||str.charAt(i+1)!=str.charAt(i))
			{
				s.append(str.charAt(i));
				s.append(count);
				count=0;
			}
		}
		return s.length()<=str.length()? s.toString():str;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="abcdefggggggggggg";
		System.out.println(isCompression(str));
	}

}
