
public class Q2
{
	public static  LinkedListNode kthToLast(int k, LinkedListNode head)
	{
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for (int i = 0; i < k; i++)
		{
			if (p1 == null)
				return null;
				p1 = p1.next;
		}
		
		while (p1 != null)
		{
			p1 = p1.next;
			p2 = p2.next;
		}
		//System.out.println(p1.printForward());
		System.out.println(p2.printForward());
		return p2;
	}

	public static void main(String[] args)
	{
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
		LinkedListNode h = kthToLast(2, head);
		System.out.println(h.printForward());
		// TODO Auto-generated method stub

	}
}
