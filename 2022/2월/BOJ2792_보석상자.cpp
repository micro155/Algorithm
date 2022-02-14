#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int N, M;
vector<int> v;

int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> N >> M;

	for (int i = 0; i < M; i++) {
		int num;
		cin >> num;
		v.push_back(num);
	}

	int start = 1;
	int end = 1e9;
	int result = 0;

	while (start <= end) {

		int mid = (start + end) / 2;
		int len = v.size();
		long long int sum = 0;

		for (int i = 0; i < len; i++) {
			sum += (long long int) ceil((double)v[i] / (double)mid);
		}

		if (sum <= N) {
			end = mid - 1;
			result = mid;
		}
		else {
			start = mid + 1;
		}

	}

	cout << result << '\n';

	return 0;


}