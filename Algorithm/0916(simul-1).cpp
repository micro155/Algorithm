#include <iostream>

using namespace std;


int main(void)
{
	string str;
	int summary = 0;
	

	cin >> str;

	for (int i = 0; i < str.size() / 2; i++)
	{
		summary += str[i] - '0';
	}

	for (int i = str.size() / 2; i < str.size(); i++)
	{
		summary -= str[i] - '0';
	}

	if (summary == 0)
	{
		cout << "LUCKY" << '\n';
	}
	else
	{
		cout << "READY" << '\n';
	}



	



}