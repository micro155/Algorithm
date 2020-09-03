#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <queue>
#define INF 1e9

using namespace std;


int n, m;
int graph[501][501];


int main(void)
{
	cin >> n >> m;

	for (int i = 0; i < 501; i++)
	{
		fill(graph[i], graph[i] + 501, INF);
	}

	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= n; j++)
		{
			if (i == j)
			{
				graph[i][j] = 0;
			}
		}
	}

	for (int i = 0; i < m; i++)
	{
		int a, b, c;
		cin >> a >> b >> c;
		graph[a][b] = c;
	}

	for (int k = 1; k <= n; k++)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				graph[i][j] = min(graph[i][j], graph[i][k] + graph[k][j]);
			}
		}
	}

	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= n; j++)
		{
			if (graph[i][j] == INF)
			{
				cout << "INFINITY" << ' ';
			}
			else
			{
				cout << graph[i][j] << ' ';
			}
		}
		cout << '\n';
	}
}