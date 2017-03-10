#include<iostream>
#include<vector>
#include "../../Source/IO/MyScanner.h"
#include "../../Source/Graph/UnionFind.h"

using namespace std;

int main()
{
	MyScanner sc;
	int t = sc.nextInt();
	while(t--)
	{
		int n = sc.nextInt();
		int m = sc.nextInt();

		UnionFind uf(n); 
		for(int i=0;i<m;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;b--;
			uf.join(a,b);
		}

		vector<vector<int> > components = uf.getComponents();
		for(int i=0;i<components.size();i++)
		{
			for(int j=0;j<components[i].size();j++)
			{
				cout<<(components[i][j]+1)<<" ";
			}
			cout<<endl;
		}
	}
}