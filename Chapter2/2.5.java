
public class Q5
{
	public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry)
	{
		if (l1 == null && l2 == null && carry == 0)
		{
			return null;
		}
		LinkedListNode result = new LinkedListNode();
		int value = carry;
		if (l1 != null)
		{
			value += l1.data;
		}
		if (l2 != null)
		{
			value += l2.data;
		}
		result.data = value % 10;// second digit of number

		if (l1 != null || l2 != null)
		{
			LinkedListNode more = addLists(l1 == null ? null : l1.next, l2 == null ? null : l2.next,
					value >= 10 ? 1 : 0);
			result.setNext(more);
		} 
		return result;
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
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		LinkedListNode h = addLists(head, head,0);
		System.out.println(h.printForward());
	}

}
