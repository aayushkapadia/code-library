#include<vector>
using namespace std;

class UnionFind
{
private:
	int *parent;	
	int *size1;	
	int n;		
public:
	UnionFind(int n);
	bool join(int a,int b);
	bool areConnected(int a,int b);
	int getSize(int a);
	vector<vector<int> > getComponents();
private:
	int getParent(int i);
};