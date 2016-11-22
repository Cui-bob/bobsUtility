package bobsUtility;

public class arrays {
	
	/**
	 * To insert an integer to a specified place in an integer array.
	 * @param element the integer to be inserted.
	 * @param array the array to be inserted in.
	 * @param index the index that the new integer to be inserted to.
	 * @return the new array whose length is the original length + 1.
	 */
	public static int[] insert(int element, int[] array, int index)
	{
		if(array==null)
		{
			return null;
		}
		int[] newArray = new int[array.length+1];
		
		for(int i=0;i<array.length;i++)
		{
			newArray[i] = array[i];
		}
		
		for(int i=newArray.length-1;i>index;i--)
		{
			newArray[i] = newArray[i-1];
		}
		newArray[index] = element;
		return newArray;
	}
	
	/**
	 * To insert an double to a specified place in an double array.
	 * @param element the double to be inserted.
	 * @param array the array to be inserted in.
	 * @param index the index that the new double to be inserted to.
	 * @return the new array whose length is the original length + 1.
	 */
	public static double[] insert(double element, double[] array, int index)
	{
		if(array==null)
		{
			return null;
		}
		double[] newArray = new double[array.length+1];
		
		for(int i=0;i<array.length;i++)
		{
			newArray[i] = array[i];
		}
		
		for(int i=newArray.length-1;i>index;i--)
		{
			newArray[i] = newArray[i-1];
		}
		newArray[index] = element;
		return newArray;
	}
	
	/**
	 * To insert an byte to a specified place in an byte array.
	 * @param element the byte to be inserted.
	 * @param array the array to be inserted in.
	 * @param index the index that the new byte to be inserted to.
	 * @return the new array whose length is the original length + 1.
	 */
	public static byte[] insert(byte element, byte[] array, int index)
	{
		if(array==null)
		{
			return null;
		}
		byte[] newArray = new byte[array.length+1];
		
		for(int i=0;i<array.length;i++)
		{
			newArray[i] = array[i];
		}
		
		for(int i=newArray.length-1;i>index;i--)
		{
			newArray[i] = newArray[i-1];
		}
		newArray[index] = element;
		return newArray;
	}
	
	/**
	 * To delete an element specified by an index.
	 * @param array the target array.
	 * @param index the location of the element to be deleted.
	 * @return the new array that is 1 unit shorter than the original.
	 */
	public static int[] delete(int[] array, int index)
	{
		if(array == null)
		{
			return null;
		}
		int[] newArray = new int[array.length-1];
		for(int i = index; i<array.length - 1; i++)
		{
			array[i] = array[i+1];
		}
		for(int i=0;i<newArray.length;i++)
		{
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	/**
	 * To delete an element specified by an index.(double)
	 * @param array the target array.
	 * @param index the location of the element to be deleted.
	 * @return the new array that is 1 unit shorter than the original.
	 */
	public static double[] delete(double[] array, int index)
	{
		if(array == null)
		{
			return null;
		}
		double[] newArray = new double[array.length-1];
		for(int i = index; i<array.length - 1; i++)
		{
			array[i] = array[i+1];
		}
		for(int i=0;i<newArray.length;i++)
		{
			newArray[i] = array[i];
		}
		return newArray;
	}
		
	/**
	 * Test Method
	 */
	public static void main(String arg[])
	{
		int[] array = {1,2,3,4,5};
		//int a = 6;
		array = insert(1,array,1);
		System.out.println(array.length);
	}

}
