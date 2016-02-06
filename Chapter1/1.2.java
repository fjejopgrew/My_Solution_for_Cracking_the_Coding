import java.util.Arrays;

public class isPermutation {
	public static String sort(String str)
	{
		char[] content=str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean isPermutation(String a, String b)
	{
		return sort(a).equals(sort(b));
	}
	
	public static boolean isPermutation2(String a, String b)
	{
		if (a.length()!=b.length())
			return false;
		
		int[] letters=new int[128];
		
		char[] s_array = a.toCharArray();
		for(char c:s_array)
		{
			letters[c]++;
		}
		
		for(int i=0;i<b.length();i++)
		{
			int c=(int) b.charAt(i);
			letters[c]--;
			if(letters[c]<0)
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pairs={{"apple", "papel"}, {"carrot", "tarroc"}, {"aahh", "hhhh"}};
		for(String[] pair : pairs)
		{
			System.out.println(isPermutation2(pair[0],pair[1]));
		}
	}

}
