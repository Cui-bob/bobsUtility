package bobsUtility;

import java.util.EmptyStackException;

/**
 * 
 * @author Zhijie Cui
 *
 * @param <E>
 */
public class Stack<E> {
	
	private Object[] stack;
	private int size;
	private E[] newStack;
	private int top = -1; // Empty Stack
	
	@SuppressWarnings("unchecked")
	public Stack(int size)
	{
		this.size = size;
		stack = new Object[size];
		try{
			newStack = (E[])stack;
		}
		catch(Exception e)
		{
			System.out.println("Not Valid Input Arg.");
		}
	}
	
	public void push(E newE)
	{
		if(newStack.length!=100)
		{
			newStack[++top] = newE;
		}
		else
		{
			throw new StackOverflowError();
		}
	}
	
	public E pop()
	{
		if(newStack.length!=0)
		{
			return newStack[top--];
		}
		else
		{
			throw new EmptyStackException();
		}
	}
}
