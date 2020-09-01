#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


int binarySearch(vector<int> arr, int target, int start, int end)
{
	if (start > end)
		return -1;

	int mid = (start + end) / 2;

	if (arr[mid] == target)
	{
		return mid;
	}
	else if (arr[mid] < target)
	{
		return binarySearch(arr, target, mid + 1, end);
	}
	else
	{
		return binarySearch(arr, target, start, mid - 1);
	}
}


int n, m, target;
vector<int> arr;
vector<int> Customer;
vector<string> stock;

int main(void)
{
	cin >> n;

	for (int i = 0; i < n; i++)
	{
		int x;
		cin >> x;
		arr.push_back(x);
	}

	sort(arr.begin(), arr.end());

	cin >> m;

	for (int i = 0; i < m; i++)
	{
		int y;
		cin >> y;
		Customer.push_back(y);
	}

	for (int i = 0; i < m; i++)
	{
		int result = binarySearch(arr, Customer[i], 0, n - 1);
		if (result == -1)
		{
			stock.push_back("no");
		}
		else
		{
			stock.push_back("yes");
		}
	}

	for (int i = 0; i < m; i++)
	{
		cout << stock[i] << '\n';
	}


}