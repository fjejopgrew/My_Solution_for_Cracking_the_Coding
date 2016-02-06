
public class Q8
{
	public static LinkedListNode findBegining(LinkedListNode head)
	{
		LinkedListNode fast=head;
		LinkedListNode slow=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow)
			break;
		}		
		
		
		if(fast==null||fast.next==null)
		{
			return null;
		}
		
		LinkedListNode start=head;
		while(start!=slow)
		{
			slow=slow.next;
			start=start.next;
		}
		
		return slow;
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
		head.next.next.next.next=head.next.next;
		System.out.println(findBegining(head).data);
	}

}
