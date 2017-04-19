#include<string>
using namespace std;

/*
	This class is used to scan data from standard IO stream
*/
class MyScanner
{
private:
	bool newLineScanned;	// Indicates whether new line character of previous line scanned. Only checked when using nextLine()
public:
	MyScanner();
	/*
		Reads next token as a string from the data
	*/
	string next();

	/*
		Reads next line as a whole from the data. If 1 or more tokens are already read from the current line
		and it contains few more tokens then it will dump all the tokens on current line and return just the next line after it
	*/
	string nextLine();

	/*
		Reads next token as a int from the data
	*/
	int nextInt();

	/*
		Reads next token as a long long int from the data
	*/
	long long int nextLong();

	/*
		Reads next token as a double from the data
	*/
	double nextDouble();
};
