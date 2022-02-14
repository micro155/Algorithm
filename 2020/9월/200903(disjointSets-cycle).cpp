#define _CRT_SECURE_NO_WARNINGS
#include <iostream>



using namespace std;


int v, e;
int parent[10001];



int findParent(int x)
{
	if (x == parent[x]) return x;
	return parent[x] = findParent(parent[x]);
}

void unionParent(int a, int b)
{
	a = findParent(a);
	b = findParent(b);
	if (a < b)
		parent[b] = a;
	else
		parent[a] = b;
}



int main(void)
{
	cin >> v >> e;

	for (int i = 1; i <= v; i++)
	{
		parent[i] = i;
	}

	bool cycle = false;

	for (int i = 0; i < e; i++)
	{
		int a, b;
		cin >> a >> b;
		
		if (findParent(a) == findParent(b))
		{
			cycle = true;
			break;
		}
		else
		{
			unionParent(a, b);
		}

	}



	if (cycle)
	{
		cout << "사이클이 발생했습니다." << '\n';
	}
	else
	{
		cout << "사이클이 발생하지 않았습니다" << '\n';
	}
}