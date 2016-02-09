package Q1;

import java.util.Arrays;

public class sortArrays
{
	public static int[] sortArrays(int[] a, int[] b)
	{
		int[] all = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++)
		{
			all[i] = a[i];
		}

		for (int i = 0; i < b.length; i++)
		{
			all[i + a.length] = b[i];
		}
		Arrays.sort(all);
		return all;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a =
		{ 1, 3, 5, 7, 9 };
		int[] b =
		{ 2, 4, 6, 8 };
		int all[] = sortArrays(a, b);
		for (int i = 0; i < all.length; i++)
		{
			System.out.println(all[i]);
		}
	}

}
