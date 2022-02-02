#include <iostream>

using namespace std;

int N, M;
int arr[50][2];


int main(void) {

	cin >> N >> M;

	for (int i = 0; i < M; i++) {
		cin >> arr[i][0] >> arr[i][1];
	}

	int temp = N;
	int min_package = 1e9;
	int min_cnt = 1e9;
	int result = 0;


	for (int i = 0; i < M; i++) {
		min_package = min(min_package, arr[i][0]);
		min_cnt = min(min_cnt, arr[i][1]);
	}

	while (temp >= 6) {

		if (min_package < min_cnt * 6) {
			result += min_package;
		}
		else {
			result += min_cnt * 6;
		}
		temp -= 6;
	}

	if (temp > 0) {
		if (min_package < min_cnt * temp) {
			result += min_package;
		}
		else {
			result += min_cnt * temp;
		}
	}
	


	cout << result << '\n';
	
}