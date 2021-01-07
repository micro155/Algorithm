#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n;

vector<int> v;


int main(void)
{
	cin >> n;

	for (int i = 0; i < n; i++) {
		int num;
		cin >> num;
		v.push_back(num);
	}

	sort(v.begin(), v.end());

	cout << v[(n - 1) / 2] << '\n';

}

