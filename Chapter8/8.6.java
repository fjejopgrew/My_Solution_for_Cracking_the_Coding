package Q6;

import java.util.Stack;

public class hanoi
{
	public class Tower
	{
		private Stack<Integer> disks;
		private int index;
		
		public Tower(int i) 
		{
			disks = new Stack<Integer>();
			index = i;
		}
		
		public int index()
		{
			return index;
		}
		
		public void add(int d)
		{
			if(!disks.isEmpty()&&disks.peek()<=d)
			{
				System.out.println("Error");
			}
			else
			{
				disks.push(d);
			}
		}
		
		public void moveTop(Tower t)
		{
			int top=disks.pop();
			t.add(top);
		}
		
		public void moveDisks(int n, Tower dest, Tower buffer)
		{
			if(n>0)
			{
				moveDisks(n-1, buffer,dest);
				moveTop(dest);
				buffer.moveDisks(n-1,dest,this);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// Set up code.
		int n = 5;
		Tower[] towers = new Tower[3];
//		for (int i = 0; i < 3; i++) {
//			towers[i] = new Tower(i);
//		}
		for (int i = n - 1; i >= 0; i--) {
			towers[0].add(i);
		}
		
		// Copy and paste output into a .XML file and open it with internet explorer.
		//towers[0].print();
		towers[0].moveDisks(n, towers[2], towers[1]);
		//towers[2].print();
	}

}
