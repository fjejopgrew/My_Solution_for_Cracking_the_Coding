
public class oneEditAway
{
	public static boolean oneEditAway(String first, String second)
	{
		if (first.length() == second.length())
		{
			return oneEditReplace(first, second);
		} else if (first.length() + 1 == second.length())
		{
			return oneEditInsert(first, second);
		} else if (first.length() == second.length() + 1)
		{
			return oneEditInsert(second, first);
		}
		return false;
	}

	// check if you can replace one character of the String
	public static boolean oneEditReplace(String first, String second)
	{
		boolean foundDifference = false;
		for (int i = 1; i < first.length(); i++)
		{
			if (first.charAt(i) != second.charAt(i))
			{
				if (foundDifference)
					return false;
				foundDifference = true;
			}
		}
		return true;
	}

	public static boolean oneEditInsert(String first, String second)
	{
		int index1 = 0, index2 = 0;
//		while (index1 < first.length() && index2 < second.length())
//		{
			if (first.charAt(index1) != second.charAt(index2))
			{
				if (index1 != index2)
				{
					return false;
				}
				index2++;
			} else
			{
				index1++;
				index2++;
			}
//		}
		return true;
	}

	public static void main(String[] args)
	{
		String a = "abcdef", b = "abcdefg";
		String c = "abcdef", d = "abcdefgh";
		System.out.println(oneEditAway(a, b));
		// TODO Auto-generated method stub

	}

}
