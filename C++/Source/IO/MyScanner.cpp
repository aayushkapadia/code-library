#include<iostream>
using namespace std;

class MyScanner
{
public:
	MyScanner()
	{
		std::ios::sync_with_stdio(false);
		cin.tie(NULL);
	}
	string next()
	{
		string x;
		cin>>x;
		return x;
	}
	string nextLine()
	{
		string x;
		getline(cin,x);
		return x;
	}
	int nextInt()
	{
		int x;
		cin>>x;
		return x;
	}
	long long int nextLong()
	{
		long long int x;
		cin>>x;
		return x;
	}
	double nextDouble()
	{
		double x;
		cin>>x;
		return x;
	}
};
