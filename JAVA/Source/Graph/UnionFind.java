package Source.Graph;

import java.util.*;

/*	This class divides the vertices from 1 to n into several components
	It will keep track of which vertice is in which component
	Initially all the vertices will be in there respective component
*/
public class UnionFind
{
	private int[] parent;
	private int[] size;

	/*
		Constrct object of this class
		@param n : The number of vertices you want to keep track of
	*/
	public UnionFind(int n)
	{
		parent = new int[n];
		size = new int[n];

		for(int i=0;i<n;i++)
		{
			parent[i] = i;
			size[i] = 1;
		}
	}

	private int getParent(int i)
	{
		int curr = i;
		while(parent[curr]!=curr)
		{
			curr = parent[curr];
		}

		int j = i;
		while(j!=curr)
		{
			int temp = parent[j];
			parent[j] = curr;
			j = temp;
		}

		return curr;
	}

	/*
		Combines component of b into component of a
		@param a,b The two vertices whose components you want to combine
		@return True if two vertices were initially in two different components 
				False if two components were initially in the same component
	*/
	public boolean join(int a,int b)
	{
		int parA = getParent(a);
		int parB = getParent(b);

		if(parA==parB)
			return false;
		else
		{
			parent[parB] = parA;
			size[parA]+=size[parB];
			return true;
		}
	}

	/*
		Checks if both the vertices belongs to the same component
		@ param a,b The two vertices
		@ return True if belongs to the same component
				 False if belongs to different component
	*/
	public boolean areConnected(int a,int b)
	{
		int parA = getParent(a);
		int parB = getParent(b);

		return parA==parB;
	}

	/*
		Returns the size of the component of vertice a
		@ param a : The vertice
	*/
	public int getSize(int a)
	{
		int parA = getParent(a);
		return size[parA];
	}

	/*
		Returns ArrayList of all components formed. A Individual Component 
		is also a ArrayList of Integer indicating the vertices belonging to that component
	*/
	public ArrayList<ArrayList<Integer>> getComponents()
	{
		ArrayList<ArrayList<Integer>> components = new ArrayList<ArrayList<Integer>>();
		int n = size.length;

		int[] componentNo = new int[n];

		for(int i=0;i<n;i++)
		{
			int parI = getParent(i);
			if(parI==i)
			{
				componentNo[i] = components.size();
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				components.add(list);
			}
		}

		for(int i=0;i<n;i++)
		{
			int parI = getParent(i);
			if(parI!=i)
			{
				int componentNumber = componentNo[parI];
				components.get(componentNumber).add(i);
			}
		}

		return components;
	}
}