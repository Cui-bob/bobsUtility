package bobsUtility;

/**
 * SinglyLinkedList: When pop data, it is hard to remove the poped item from the list, since its last object is hard
 * to locate.
 * @author Zhijie Cui
 *
 * @param <E> Generic Type
 */
public class SinglyLinkedList<E> {
	class Node<E>
	{
		public E data;
		public Node<E> nextNode;
		
		public Node(E data,Node<E> nextNode)
		{
			this.data = data;
			this.nextNode = nextNode;
		}
	}
	
	private Node<E> head;
	
	public SinglyLinkedList()
	{
	}
	
	public void push(E newData)
	{
		Node<E> node = new Node<E>(newData,head);
		head = node;
	}
	
	public E pop()
	{
		Node<E> lastNode = head;
		Node<E> lastNodeToBe = null;
		while(lastNode.nextNode!=null)
		{
			lastNodeToBe = lastNode;
			lastNode = lastNode.nextNode;
		}
		if(lastNodeToBe != null)
			lastNodeToBe.nextNode = null;
		E popData = lastNode.data;
		return popData;
	}
}

