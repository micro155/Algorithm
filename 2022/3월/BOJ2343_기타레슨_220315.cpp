#include <iostream>
#include <algorithm>

using namespace std;

int N, M;
int arr[100001];


int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> N >> M;

	int min_num = -1e9;
	int max_num = 0;

	for (int i = 0; i < N; i++) {
		cin >> arr[i];
		min_num = max(min_num, arr[i]);
		max_num += arr[i];
	}

	int start = min_num;
	int end = max_num;

	while (start <= end) {

		int mid = (start + end) / 2;
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < N; i++) {

			if (sum + arr[i] > mid) {
				sum = 0;
				cnt++;
			}
			sum += arr[i];
		}

		if (sum != 0) {
			cnt++;
		}

		if (cnt > M) {
			start = mid + 1;
		}
		else {
			end = mid - 1;
		}

	}

	cout << start << '\n';
	

}