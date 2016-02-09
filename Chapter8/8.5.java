package Q5;

public class mult
{
	public static int mult(int a, int b)
	{
		int sum=0;
		if(a<b)
		{
			int j=a;
			a=b;
			b=j;
		}
		for(int i=0;i<b;i++)
		{
			sum+=a;
		}
		return sum;
	}

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=2, b=200;
		System.out.println(mult(b,a));
	}

}
