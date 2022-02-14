#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
#define INF 1e9

using namespace std;


int n, m;
int graph[101][101];


int main(void)
{
	cin >> n >> m;

	for (int i = 0; i < 101; i++)
	{
		fill(graph[i], graph[i] + 101, INF);
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
		int a, b;
		cin >> a >> b;
		graph[a][b] = 1;
		graph[b][a] = 1;
	}


	int x, k;
	cin >> x >> k;

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

	int distance = graph[1][k] + graph[k][x];

	
	if (distance >= INF)
	{
		cout << "-1" << ' ';
	}
	else
	{
		cout << distance << '\n';
	}
		
}