
public class Q4
{
	public static LinkedListNode partition(LinkedListNode node,int x)
	{
		LinkedListNode head=node;
		LinkedListNode tail=node;
		while(node!=null)
		{
			LinkedListNode next=node.next;
			if(node.data<x)
			{
				//insert node at head
				node.next=head;
				head=node;
			}else
			{
				//insert node at tail
				tail.next=node;
				tail=node;
			}
			node=next;
		}
		tail.next=null;
		return head;
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
				LinkedListNode h=partition(head,1);
				System.out.println(h.printForward());

	}

}
