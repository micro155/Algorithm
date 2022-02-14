#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <set>

using namespace std;

int n, m;
set<int> s;
vector<int> Customer;

int main(void)
{
	cin >> n;

	for (int i = 0; i < n; i++)
	{
		int x;
		cin >> x;
		s.insert(x);
	}

	cin >> m;

	for (int i = 0; i < m; i++)
	{
		int y;
		cin >> y;
		Customer.push_back(y);
	}

	for (int i = 0; i < m; i++)
	{
		if (s.find(Customer[i]) != s.end())
		{
			cout << "yes" << '\n';
		}
		else
		{
			cout << "no" << '\n';
		}
	}

}