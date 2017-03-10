package Source.Graph;

import java.util.*;

public class UnionFind
{
	private int[] parent;
	private int[] size;

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

	public boolean areConnected(int a,int b)
	{
		int parA = getParent(a);
		int parB = getParent(b);

		return parA==parB;
	}

	public int getSize(int a)
	{
		int parA = getParent(a);
		return size[parA];
	}

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