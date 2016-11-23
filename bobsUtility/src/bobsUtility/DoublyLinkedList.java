package bobsUtility;

public class DoublyLinkedList<E> {

	class Node<E>{
		public E data;
		public Node<E> nextNode;
		public Node<E> lastNode;
		
		public Node(E newData,Node<E> nextNode, Node<E> lastNode){
			this.data = newData;
			this.nextNode = nextNode;
			this.lastNode = lastNode;
		}
		
	}
	
	private Node<E> head;
	
	public void push(E newData)
	{
		Node<E> newNode = new Node<E>(newData,head,null);
		if(head!=null)
		{
			head.lastNode = newNode;
		}
		newNode.lastNode = null;
		newNode.nextNode = head;
		head = newNode;
	}
	
	public E pop()
	{
		Node<E> endNode = head;
		while(endNode.nextNode != null)
		{
			endNode = endNode.nextNode;
		}
		E popData = endNode.data;
		endNode.lastNode.nextNode = null;
		return popData;
	}
	
	public String toString()
	{
		String str  = "";
		Node<E> endNode = head;
		while(endNode!=null)
		{
			if(endNode.nextNode!=null && endNode.lastNode!=null)
			{
				str += endNode.lastNode.data.toString() + "->" + endNode.data.toString() + "->" + endNode.nextNode.data.toString();
			}
			else if(endNode.lastNode == null)
			{
				str += "Null" + "->" + endNode.data.toString() + "->" + endNode.nextNode.data.toString();
			}
			else
			{
				str += endNode.lastNode.data.toString() + "->" + endNode.data.toString() + "->" + "Null";
			}
			str+="\n";
			endNode = endNode.nextNode;
		}
		return str;
	}
}
