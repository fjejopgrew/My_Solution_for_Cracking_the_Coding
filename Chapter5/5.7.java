package Q7;

//can't solve this problem
public class swapOddEven
{
	public static int swapOddEven(int a)
	{
		//a mask of odd bits
		int x=((a|0xaa)>>>1)|((a&0x55)<<1);
		return x;
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=257;
		System.out.println(Integer.toBinaryString(swapOddEven(a)));
	}

}
