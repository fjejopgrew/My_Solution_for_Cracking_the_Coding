package Q10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class peakandValley
{
	//I use ArrayList to insert the elements
	public static void peakandValley(ArrayList<Integer> arr)
	{
		int len=arr.size();
		for(int i=0;i<arr.size();i=i+2)
		{
			insert(arr,len-1,i+1);
		}
	}
	
	public static void insert(ArrayList<Integer> arr, int a, int b)
	{
		arr.add(b,arr.get(a));
		arr.remove(a+1);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(6);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(1);
		arr.add(0);
		arr.add(2);
		Collections.sort(arr);
		peakandValley(arr);
		System.out.println(arr);
	}

}
