package Q4;

import java.util.ArrayList;

public class subSets
{
	public static ArrayList<ArrayList<Integer>> subSets(ArrayList<Integer> set, ArrayList<ArrayList<Integer>> subSets)
	{
		
		if (set.size() == 0)
		{
			return null;
		}
		
		else if (!subSets.contains(set))
		{
			ArrayList<Integer> temSet=(ArrayList<Integer>) set.clone();
			subSets.add(temSet);	
		}
		for (int i = 0; i < set.size(); i++)
		{
			int temNum = set.get(i);
			set.remove(i);
			subSets(set, subSets);
			set.add(i, temNum);
		}
		return subSets;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);

		ArrayList<ArrayList<Integer>> subSets = new ArrayList<ArrayList<Integer>>();

		System.out.println("All subsets: " + subSets(set, subSets));
	}

}
