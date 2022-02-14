#include <iostream>
#include <vector>

using namespace std;


int n;
vector<int> arr;

int main(void) {

	cin >> n;

	for (int i = 0; i < n; i++) {
		int x;
		cin >> x;
		arr.push_back(x);
	}

	int count = 0;
	int result = 0;

	for (int i = 0; i < n; i++) {

		count += 1;

		if (count >= arr[i]) {
			result += 1;
			count = 0;
		}
	}

	cout << result << '\n';

}
