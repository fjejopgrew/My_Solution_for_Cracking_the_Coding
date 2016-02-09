package Q1;

public class bitsInsertion
{
	public static int bitsInsertion(int m, int n, int i, int j)
	{
		//m=10000000000, n=10011
		//creat a mask to clear bit i to bits j, 2 and 6
		//creat all 1s 11111111111
		int Ones=~0;
		int left=Ones<<(j+1);//set up all 1s before 6 11110000000
		int right=(1<<i);//set up all 1s before 2 00000000011
		//use left and right creat a mask
		int mask=left|right;
		//refresh m 10000000000
		m=mask & m; 
		//put n in the aim bits 1001100
		n=n<<i;
		return m|n;
	}

	public static void main(String[] args)
	{
		int a = 1024;
		System.out.println(Integer.toBinaryString(a));
		int b = 19;
		System.out.println(Integer.toBinaryString(b));		
		int c = bitsInsertion(a, b, 2, 6);
		System.out.println(Integer.toBinaryString(c));
	}

}
