
public class Q7
{
	public static LinkedListNode findIntersection(LinkedListNode l1, LinkedListNode l2)
	{
		if (l1 == null || l2 == null)
			return null;

		Result result1 = getTailandSize(l1);
		Result result2 = getTailandSize(l2);

		int a = 0;
		if (result1.size >= result2.size)
		{
			a = result1.size - result2.size;
			l1 = getKthNode(l1, a);
		} else
		{
			a = result2.size - result1.size;
			l2 = getKthNode(l2, a);
		}

		while (l1 != l2)
		{
			l1 = l1.next;
			l2 = l2.next;
		}
		return l1;
	}

	public static LinkedListNode getKthNode(LinkedListNode head, int k)
	{
		LinkedListNode current = head;
		for (int i = 0; i < k; i++)
		{
			current = current.next;
		}
		return current;
	}

	public static class Result
	{
		public LinkedListNode tail;
		public int size;

		public Result(LinkedListNode tail, int size)
		{
			this.tail = tail;
			this.size = size;
		}
	}

	public static Result getTailandSize(LinkedListNode list)
	{
		if (list == null)
			return null;

		int size = 1;
		LinkedListNode tail = list;
		while (tail.next != null)
		{
			size++;
			tail = tail.next;
		}
		return new Result(tail, size);
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
			second = new LinkedListNode(i, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		//head.next.next.next.next=head.next;
		LinkedListNode head2=head.next.next;
		System.out.println(head.printForward());
		System.out.println(findIntersection(head,head2).printForward());
	}

}
