#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>

using namespace std;

int n, m;
int arr[1000001];
vector<int> Customer;

int main(void)
{
	cin >> n;

	for (int i = 0; i < n; i++)
	{
		int x;
		cin >> x;
		arr[x] = 1;
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
		if (arr[Customer[i]] == 1)
		{
			cout << "yes" << '\n';
		}
		else
		{
			cout << "no" << '\n';
		}
	}

}