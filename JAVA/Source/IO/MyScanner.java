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

	/*
		Reads next token from the data
	*/
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

	/*
		Reads next token of the data as a int
	*/
	public int nextInt()
	{
		return Integer.parseInt(next());
	}

	/*
		Reads next token of the data as a long
	*/
	public long nextLong()
	{
		return Long.parseLong(next());
	}

	/*
		Reads next token of the data as a double
	*/
	public double nextDouble()
	{
		return Double.parseDouble(next());
	}

	/*
		Reads next line as a whole from the data. If one or more tokens are 
		already read from the current line and some are still left to be read then
		it will dump all the remaining tokens from the current line and read the just next line after this
	*/
	public String nextLine()
	{
		st = null;
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

	/*
		Frees all the resources used by this class
	*/
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
