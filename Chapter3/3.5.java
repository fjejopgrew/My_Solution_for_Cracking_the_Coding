package Q5;

import java.util.Stack;

public class sort
{
	public static Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> r = new Stack<Integer>();
		while (!s.isEmpty())
		{
			int tem = s.pop();// step1
			while (!r.isEmpty() && r.peek() > tem)
			{
				s.push(r.pop());
			}
			r.push(tem);
		}
		return r;
	}

	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < 10; i++)
		{
			int r = (int)(Math.random()*1000);
			s.push(r);
		}

		Stack<Integer> r=sort(s);

		System.out.println(r.isEmpty());
		while (!r.isEmpty())
		{
			System.out.println(r.pop());
		}
	}
}
