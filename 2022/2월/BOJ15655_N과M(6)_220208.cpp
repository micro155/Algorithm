#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int N, M;

bool visited[9];
int arr[9];
vector<int> num;


void dfs(int cnt) {

	if (cnt == M) {
		for (int i = 0; i < M; i++) {
			cout << arr[i] << ' ';
		}
		cout << '\n';
		return;
	}

	for (int i = 0; i < N; i++) {

		if (visited[i] || num[i] < arr[cnt - 1]) {
			continue;
		}

		visited[i] = true;
		arr[cnt] = num[i];
		dfs(cnt + 1);
		visited[i] = false;
	}

}


int main(void) {

	cin >> N >> M;

	for (int i = 0; i < N; i++) {
		int number;
		cin >> number;
		num.push_back(number);
	}
	sort(num.begin(), num.end());

	dfs(0);
	
	
}