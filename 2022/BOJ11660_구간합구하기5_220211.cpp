#include <iostream>

using namespace std;

int N, M;
int arr[1025][1025];


int main(void) {

	ios_base::sync_with_stdio(0);
	cin.tie(0);

	cin >> N >> M;

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			int num;
			cin >> num;
			arr[i + 1][j + 1] = arr[i + 1][j] + arr[i][j + 1] - arr[i][j] + num;
		}
	}

	for (int i = 0; i < M; i++) {
		int x1, y1, x2, y2;
		cin >> y1 >> x1 >> y2 >> x2;
		cout << arr[y2][x2] - arr[y1 - 1][x2] - arr[y2][x1 - 1] + arr[y1 - 1][x1 - 1] << '\n';
	}

	
}