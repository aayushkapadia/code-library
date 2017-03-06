package Source.IO;

import java.util.*;
import java.io.*;

public class MyScanner
{
	private BufferedReader br;
	private StringTokenizer st;

	public MyScanner()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		st = null;
	}

	public String next()
	{
		while(st==null || (!st.hasMoreTokens()))
		{
			try
			{
				st = new StringTokenizer(br.readLine());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

		return st.nextToken();
	}

	public int nextInt()
	{
		return Integer.parseInt(next());
	}

	public long nextLong()
	{
		return Long.parseLong(next());
	}

	public double nextDouble()
	{
		return Double.parseDouble(next());
	}

	public String nextLine()
	{
		String str = "";
		try 
		{
	    	str = br.readLine();
	  	} 
	  	catch (IOException e) 
	  	{
	    	e.printStackTrace();
	  	}
	  	return str;
	}

	public void close()
	{
		try
		{
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		st = null;
	}

}
