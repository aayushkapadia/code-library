#include<vector>
#include "UnionFind.h"

using namespace std;

UnionFind::UnionFind(int n)
{
	parent = new int[n];
	size1 = new int[n];
	this->n = n;

	for(int i=0;i<n;i++)
	{
		parent[i] = i;
		size1[i] = 1;
	}
}

int UnionFind::getParent(int i)
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

bool UnionFind::join(int a,int b)
{
	int parA = getParent(a);
	int parB = getParent(b);

	if(parA==parB)
		return false;
	else
	{
		parent[parB] = parA;
		size1[parA]+=size1[parB];
		return true;
	}
}

bool UnionFind::areConnected(int a,int b)
{
	int parA = getParent(a);
	int parB = getParent(b);

	return parA==parB;
}

int UnionFind::getSize(int a)
{
	int parA = getParent(a);
	return size1[parA];
}

vector<vector<int> > UnionFind::getComponents()
{
	vector<vector<int> > components;
	
	int *componentNo = new int[n];

	for(int i=0;i<n;i++)
	{
		int parI = getParent(i);
		if(parI==i)
		{
			componentNo[i] = components.size();
			vector<int> list;
			list.push_back(i);
			components.push_back(list);
		}
	}

	for(int i=0;i<n;i++)
	{
		int parI = getParent(i);
		if(parI!=i)
		{
			int componentNumber = componentNo[parI];
			components[componentNumber].push_back(i);
		}
	}

	return components;
}