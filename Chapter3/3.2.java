
public class Q2
{

	public static void main(String[] args)
	{
		//StackWithMin stack = new StackWithMin();
		StackwithMin2 stack2 = new StackwithMin2();
		int[] array = {4, 5, 3, 7, 4, 6, 1};
		for (int value : array) {
			//stack.push(value);
			stack2.push(value);
			System.out.print(value + ", ");
		}
		System.out.println('\n');
		for (int i = 0; i < array.length; i++) {
			System.out.println("Popped "  + stack2.pop());
			System.out.println("New min is "+ stack2.min());
		}

	}

}
