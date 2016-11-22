package bobsUtility;


public class Queue<E> {
	private Object[] queue;
	private int size;
	
	public Queue(int size)
	{
		this.size = size;
		queue = new Object[size];
		try{
			E[] newQueue = (E[])queue;
		}
		catch(Exception e)
		{
		}
	}
}
