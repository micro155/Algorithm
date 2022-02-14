#include <iostream>

using namespace std;

int N, M;
int arr[8];
bool visited[8];

void dfs(int cnt) {

	if (cnt == M) {
		for (int i = 0; i < M; i++) {
			cout << arr[i] << ' ';
		}
		cout << '\n';
		return;
	}
	for (int i = 1; i <= N; i++) {
		visited[i] = true;
		arr[cnt] = i;
		dfs(cnt + 1);
		visited[i] = false;
	}

}

int main(void) {

	cin >> N >> M;

	dfs(0);
	
	
}