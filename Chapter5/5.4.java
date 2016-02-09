package Q4;

public class nextNum
{
	public static int countOnes(int num)
	{
		String n = Integer.toBinaryString(num);
		System.out.println(n);
		int count = 0;
		for (int i = 0; i < n.length(); i++)
		{
			if (n.charAt(i) == '1')
			{
				count++;
			}
		}
		return count;
	}

	public static int getNext(int num)
	{
		int a = ~0;
		String n = Integer.toBinaryString(num);
		//System.out.println(n);
		int ones = countOnes(num);
		int dif = 0, nTem = 0, onesTem = 0;

		for (int i = n.length() - 2; i >= 0; i--)
		{
			if (n.charAt(i) == '0' && n.charAt(i + 1) =='1')
			{
				nTem = num | (1 << (n.length()-(i + 1)));
				nTem=nTem&(a<<n.length()-i-1);
				onesTem = countOnes(nTem);
				dif = ones - onesTem;
				break;
			}
		}
		int mask=~(a<<dif);
		return nTem|mask;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i = 13948;
		int num=getNext(i);
		System.out.println(Integer.toBinaryString(num));
	}

}
