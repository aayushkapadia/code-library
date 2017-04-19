#include<vector>
using namespace std;

/*
	This class divides the vertices from 1 to n into several components
	It will keep track of which vertice is in which component
	Initially all the vertices will be in there respective component
*/
class UnionFind
{
private:
	int *parent;	
	int *size1;	
	int n;		
public:
	/*
		Constrct object of this class
		@param n : The number of vertices you want to keep track of
	*/
	UnionFind(int n);

	/*
		Combines component of b into component of a
		@param a,b The two vertices whose components you want to combine
		@return True if two vertices were initially in two different components 
				False if two components were initially in the same component
	*/
	bool join(int a,int b);

	/*
		Checks if both the vertices belongs to the same component
		@ param a,b The two vertices
		@ return True if belongs to the same component
				 False if belongs to different component
	*/
	bool areConnected(int a,int b);

	/*
		Returns the size of the component of vertice a
		@ param a : The vertice
	*/
	int getSize(int a);

	/*
		Returns vector of all components formed. A Individual Component 
		is also a vector of ints indicating the vertices belonging to that component
	*/
	vector<vector<int> > getComponents();
private:
	int getParent(int i);
};