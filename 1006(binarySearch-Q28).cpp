#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>


using namespace std;


int n;

vector<int> arr;



int binarySearch(vector<int>& arr, int start, int end) {
	if (start > end) return -1;
	int mid = (start + end) / 2;

	if (arr[mid] == mid)
		return mid;
	else if (arr[mid] > mid)
		return binarySearch(arr, start, mid - 1);
	else
		return binarySearch(arr, mid + 1, end);
}

int main(void)
{
	cin >> n;

	for (int i = 0; i < n; i++)
	{
		int a;
		cin >> a;
		arr.push_back(a);
	}

	int index = binarySearch(arr, 0, n - 1);

	cout << index << '\n';
}