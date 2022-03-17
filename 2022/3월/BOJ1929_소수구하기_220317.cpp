#include <iostream>

using namespace std;

int M, N;
int arr[1000001] = { 0 };


int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	arr[1] = 1;

	cin >> N >> M;

	for (int i = 2; i <= M; i++) {
		for (int j = 2; i * j <= M; j++) {
			arr[i * j] = 1;
		}
	}

	for (int i = N; i <= M; i++) {
		if (arr[i] == 0) {
			cout << i << '\n';
		}
	}
	

}