import java.util.Stack;

public class Q6
{
	public static boolean isPalindrome(LinkedListNode head)
	{
		Stack<Integer> stack = new Stack<Integer>();

		LinkedListNode fast = head;
		LinkedListNode slow = head;

		
		while (fast != null && fast.next != null)
		{
			stack.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		
		//Has odd number of elements, so skip the middle element
		if(fast!=null)
		{
			slow=slow.next;
		}
		
		while(slow!=null)
		{
			int top=stack.pop().intValue();
			if(top!=slow.data)
			{
				return false;
			}
			slow=slow.next;
		}
		return true;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				LinkedListNode first = new LinkedListNode(0, null, null); // AssortedMethods.randomLinkedList(1000,
																			// 0, 2);
				LinkedListNode head = first;
				LinkedListNode second = first;
				for (int i = 1; i < 10; i++)
				{
					second = new LinkedListNode(0, null, null);
					first.setNext(second);
					second.setPrevious(first);
					first = second;
				}
				System.out.println(head.printForward());
				isPalindrome(head);
				System.out.println(isPalindrome(head));
	}

}
