package Q6;

public class flipNum
{
	public static int flipNum(int numa, int numb)
	{
		int c=numa^numb;
		String dif=Integer.toBinaryString(c);
		int count=0;
		for(int i=0;i<dif.length();i++)
		{
			if(dif.charAt(i)=='1')
			{
				count++;
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=29,b=15;
		System.out.println(flipNum(a,b));
	}

}
