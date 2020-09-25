#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;
vector<char> arr;

int main(void)
{
	string str;
	int num = 0;

	cin >> str;

	sort(str.begin(), str.end());

	for (int i = str.size()-1; i >= 0; i--)
	{
		if (str[i] >= 65)
		{
			arr.push_back(str[i]);
		}
		else
		{
			num += str[i] - '0';
		}
	}

	sort(arr.begin(), arr.end());

	string s = to_string(num);

	for (int i = 0; i < s.size(); i++)
	{
		arr.push_back(s[i]);
	}

	for (int i = 0; i < arr.size(); i++)
	{
		cout << arr[i];
	}
}