package Q1;

public class sort2
{
	public static int[] sortArrays(int[] a, int[] b)
	{
		int indexA=a.length-1;
		int indexB=b.length-1;
		int indexMerged=indexA+indexB+1;
		int[] all = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++)
		{
			all[i] = a[i];
		}
		while(indexB>=0)
		{
			if(indexA>=0&&a[indexA]>b[indexB])
			{
				all[indexMerged]=a[indexA];
				indexA--;
			}
			else
			{
				all[indexMerged]=b[indexB];
				indexB--;
			}
			indexMerged--;
		}
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
