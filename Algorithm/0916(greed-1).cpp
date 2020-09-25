#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> arr;

int main(void)
{
	int n, num;
	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> num;
		arr.push_back(num);
	}

	sort(arr.begin(), arr.end());

	int result = 0;
	int count = 0;

	for (int i = 0; i < n; i++)
	{
		count += 1;
		if (count >= arr[i])
		{
			result += 1;
			count = 0;
		}
	}

	cout << result << '\n';


}