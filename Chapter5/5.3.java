package Q3;

public class longestOnes
{
	public static int longestOnes(int n)
	{
		String num=Integer.toBinaryString(n);
		int max=0;
		for(int i=0; i<num.length();i++)
		{
			if(num.charAt(i)=='0')
			{
				int nTem= n|(1<<(num.length()-i-1));
				max=Math.max(max, longestOnesTem(nTem));//find the longest
			}
		}
		return max;
	}
	
	public static int longestOnesTem(int n)
	{
		String num=Integer.toBinaryString(n);
		//System.out.println(num);
		int max=0;
		int ones=0;
		for(int i=0;i<num.length();i++)
		{
			if(num.charAt(i)=='1')
			{
				ones++;
				//System.out.println(ones);
				max=Math.max(ones, max);
			}
			else
			{
				ones=0;
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num=1775;
		System.out.println(longestOnes(num));
	}

}
