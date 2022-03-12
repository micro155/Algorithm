#include <iostream>
#include <vector>
#include <queue>

using namespace std;


class Point {

public:
	int t, cost;

	Point(int t, int cost) {
		this->t = t;
		this->cost = cost;
	}

};

int N, M;
int node[1001][1001];
vector<int> v[1001];
int a, b;

void bfs() {
	bool visited[1001] = { false };
	queue<Point> q;
	q.push(Point(a, 0));
	visited[a] = true;

	while (!q.empty()) {

		int t = q.front().t;
		int cost = q.front().cost;
		q.pop();

		if (t == b) {
			cout << cost << '\n';
			break;
		}

		for (int i = 0; i < v[t].size(); i++) {
			if (!visited[v[t][i]]) {
				q.push(Point(v[t][i], cost + node[t][v[t][i]]));
				visited[v[t][i]] = true;
			}
		}
	}



}

int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> N >> M;

	int x, y, z;

	for (int i = 0; i < N - 1; i++) {
		cin >> x >> y >> z;
		v[x].push_back(y);
		v[y].push_back(x);
		node[x][y] = z;
		node[y][x] = z;
	}

	for (int i = 0; i < M; i++) {
		cin >> a >> b;
		bfs();
	}
	

}