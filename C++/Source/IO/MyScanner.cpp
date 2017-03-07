#include<iostream>
#include<string>
#include<algorithm>
#include<limits>
#include "MyScanner.h"

using namespace std;

MyScanner::MyScanner()
{
	std::ios::sync_with_stdio(false);
	cin.tie(NULL);
	newLineScanned = true;
}
string MyScanner::next()
{
	newLineScanned = false;

	string x;
	cin>>x;
	return x;
}
string MyScanner::nextLine()
{
	if(!newLineScanned)
		cin.ignore(numeric_limits<std::streamsize>::max(), '\n');		

	newLineScanned = true;

	string x;
	getline(cin,x);
	return x;
}
int MyScanner::nextInt()
{
	newLineScanned = false;

	int x;
	cin>>x;
	return x;
}
long long int MyScanner::nextLong()
{
	newLineScanned = false;

	long long int x;
	cin>>x;
	return x;
}
double MyScanner::nextDouble()
{
	newLineScanned = false;

	double x;
	cin>>x;
	return x;
}
