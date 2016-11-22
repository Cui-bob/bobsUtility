package bobsUtility;

import java.io.IOException;

public class io {

	public static byte[] readLine() throws IOException
	{
		int i;
		byte[] inputStream;
		while(true)
		{
			i=System.in.available();
			inputStream = new byte[i];
			System.in.read(inputStream);
			if(i>0)
			{
				break;
			}
		}
		return inputStream;
	}
}
