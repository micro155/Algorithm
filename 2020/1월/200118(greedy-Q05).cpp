#include <iostream>


using namespace std;

int n, m;
int arr[11];

int main(void)
{
	cin >> n >> m;

	for (int i = 0; i < n; i++) {
		int x;
		cin >> x;
		arr[x] += 1;
	}

	int result = 0;

	for (int i = 0; i <= m; i++) {
		n -= arr[i];
		result += arr[i] * n;
	}

	cout << result << '\n';
}




