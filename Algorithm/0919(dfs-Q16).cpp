#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <algorithm>



using namespace std;
int arr[8][8];
int temp[8][8];
int n, m;

int dx[] = { -1, 0, 1, 0 };
int dy[] = { 0, 1, 0, -1 };
int result;


void virus(int x, int y)
{
	for (int i = 0; i < 4; i++)
	{
		int nx = x + dx[i];
		int ny = y + dy[i];
		if (nx >= 0 && nx < n && ny >= 0 && ny < m)
		{
			if (temp[nx][ny] == 0) {
				temp[nx][ny] = 2;
				virus(nx, ny);
			}
		}
	}
}


int getScore() {
	int score = 0;
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			if (temp[i][j] == 0)
			{
				score += 1;
			}
		}
	}
	return score;
}

void dfs(int count) {
	if (count == 3)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				temp[i][j] = arr[i][j];
			}
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if (temp[i][j] == 2) {
					virus(i, j);
				}
			}
		}
		result = max(result, getScore());
		return;
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			if (arr[i][j] == 0) {
				arr[i][j] = 1;
				count += 1;
				dfs(count);
				arr[i][j] = 0;
				count -= 1;
			}
		}
	}
}


int main(void)
{
	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			cin >> arr[i][j];
		}
	}

	dfs(0);
	cout << result << '\n';

}