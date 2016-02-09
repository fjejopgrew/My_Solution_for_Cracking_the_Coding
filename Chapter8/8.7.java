package Q7;

import java.util.ArrayList;

public class findAllPermutations
{
	public static ArrayList<String> findAllPermutations(String str)
	{
		if(str==null) return null;
		
		ArrayList<String> list =new ArrayList<String>();
		if(str.length()==0)
		{
			list.add("");
			return list;
		}
		
		char first=str.charAt(0);
		String remainder=str.substring(1);
		ArrayList<String> words=findAllPermutations(remainder);
		for(String word:words)
		{
			for(int j=0;j<=word.length();j++)
			{
				String s=insertCharAt(word,first,j);
				list.add(s);
			}
		}
		return list;
		
	}

	private static String insertCharAt(String word, char c, int j)
	{
		String start=word.substring(0,j);
		String end=word.substring(j);
		return start+c+end;
	}

	public static void main(String[] args) {
		ArrayList<String> list = findAllPermutations("abcde");
		System.out.println("There are " + list.size() + " permutations.");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
