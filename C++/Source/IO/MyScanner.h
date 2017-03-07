#include<string>
using namespace std;

class MyScanner
{
private:
	bool newLineScanned;	// Indicates whether new line character of previous line scanned. Only checked when using nextLine()
public:
	MyScanner();
	string next();
	string nextLine();
	int nextInt();
	long long int nextLong();
	double nextDouble();
};
