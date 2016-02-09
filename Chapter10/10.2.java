package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class sortanagrams
{
	public static void sortanagrams(String[] arr)
	{
		HashMap<String, ArrayList<String>> hml = new HashMap<String, ArrayList<String>>();

		for (int i = 0; i < arr.length; i++)
		{
			String tem = sortChars(arr[i]);
			if (hml.containsKey(tem))
			{
				hml.get(tem).add(arr[i]);
			} else
			{
				ArrayList<String> al = new ArrayList<String>();
				al.add(arr[i]);
				hml.put(tem, al);
			}

		}

		int index = 0;
		for (ArrayList<String> al : hml.values())
		{
			for (String s : al)
			{
				arr[index] = s;
				index++;
			}
		}
	}

	public static String sortChars(String s)
	{
		char[] str = s.toCharArray();
		Arrays.sort(str);
		return String.valueOf(str);
	}

	// public static boolean Compare(){}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] s =
		{ "abc", "xyz", "cba", "zyx", "acb" };
		sortanagrams(s);
		for (String str : s)
		{
			System.out.println(str);
		}
	}

}
