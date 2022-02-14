#include <iostream>
#include <vector>

using namespace std;

int N;
vector<int> v;
bool visited[9];


void dfs(int cnt) {

	if (cnt == N) {
		for (int i = 0; i < N; i++)
			cout << v[i] << ' ';
		cout << '\n';
	}

	for (int i = 1; i <= N; i++) {
		if (visited[i])
			continue;

		visited[i] = true;
		v.push_back(i);
		dfs(cnt + 1);
		v.pop_back();
		visited[i] = false;
	}

}




int main(void) {

	cin >> N;

	dfs(0);
	
	
}