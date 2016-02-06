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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pairs={{"apple", "papel"}, {"carrot", "tarroc"}, {"aahh", "hhhh"}};
		for(String[] pair : pairs)
		{
			System.out.println(isPermutation2(pair[0],pair[1]));
		}
	}

}
