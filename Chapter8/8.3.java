package Q3;

public class isMagic
{
	public static int isMagic(int[] array)
	{
		return isMagic(array, 0, array.length-1);
	}

	public static int isMagic(int[] array, int start, int end)
	{
		if(start>end)
		{
			return -1;
		}
		
		if(array[(end+start)/2]==(end+start)/2)
		{
			return (end+start)/2;
		}
		else if(array[(end+start)/2]>(end+start)/2)
		{
			return isMagic(array, start,((end+start)/2)-1);
		}
		else if(array[(end+start)/2]<(end+start)/2)
		{
			return isMagic(array,((end+start)/2)+1, end);
		}
		
		return -1;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] array={1,1,1};
		//int[] array={-40,-20,-1,1,2,3,5,7,9,12,13};
		System.out.println(isMagic(array));
	}

}
