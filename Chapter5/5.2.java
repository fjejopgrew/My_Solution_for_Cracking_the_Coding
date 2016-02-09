package Q2;

public class setBinary
{
	public static String setBinary(double n)
	{
		if(n>=1||n<=0)
		{
			return "error";
		}
		
		//build a binary String
		StringBuilder b= new StringBuilder();
		b.append(".");
		while(n>0)
		{
			//check if it less than 32
			if (b.length()>=32)
			{
				return "error";
			}
			
			int a=(int)(n*2);
			n=n*2-a;
			b.append(a);
		}
		return b.toString();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double m=0.125;
		double n=0.126;
		String binarym=setBinary(m);
		String binaryn=setBinary(n);
		System.out.println(binarym);
		System.out.println(binaryn);
	}

}
