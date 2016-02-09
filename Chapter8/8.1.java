package Q1;

public class countSteps
{

	public static int countSteps(int n)
	{
		int[] tem=new int[n+1];
		for(int i=0;i<tem.length;i++)
		{
			tem[i]=-1;
		}
		return countSteps(n, tem);
	}
	
	public static int countSteps(int n, int[] tem)
	{
		if(n<0)
		{
			return 0;
		}
		else if(n==0)
		{
			return 1;
		}
		else if(tem[n]>-1)
		{
			return tem[n];
		}
		else
		{
			tem[n]=countSteps(n-1, tem)+countSteps(n-2, tem)+countSteps(n-3, tem);
		}
		
		return tem[n];
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=10;
		System.out.println(countSteps(a));
	}

}
