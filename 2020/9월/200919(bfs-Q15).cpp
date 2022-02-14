#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <queue>


using namespace std;

vector<int> graph[300001];
vector<int>	d(300001, -1);


int main(void)
{
	int n, m, k, x;
	cin >> n >> m >> k >> x;

	for (int i = 0; i < m; i++)
	{
		int a, b;
		cin >> a >> b;
		graph[a].push_back(b);
	}

	d[x] = 0;

	queue<int> q;
	q.push(x);

	while (!q.empty())
	{
		int now = q.front();
		q.pop();
		for (int i = 0; i < graph[now].size(); i++)
		{
			int nextNode = graph[now][i];
			if (d[nextNode] == -1) {
				d[nextNode] = d[now] + 1;
				q.push(nextNode);
			}
		}
	}

	bool check = false;
	for (int i = 0; i <= n; i++)
	{
		if (d[i] == k) {
			cout << i << '\n';
			check = true;
		}
	}

	if (!check)
		cout << -1 << '\n';

}