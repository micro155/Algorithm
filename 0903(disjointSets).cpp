#define _CRT_SECURE_NO_WARNINGS
#include <iostream>



using namespace std;


int v, e;
int parent[10001];



int findParent(int x)
{
	if (x == parent[x]) return x;
	return findParent(parent[x]);
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

	for (int i = 0; i < e; i++)
	{
		int a, b;
		cin >> a >> b;
		unionParent(a, b);
	}

	cout << "�� ���Ұ� ���� ����: ";
	for (int i = 1; i <= v; i++)
	{
		cout << findParent(i) << ' ';
	}
	cout << '\n';

	cout << "�θ� ���̺�: ";
	for (int i = 1; i <= v; i++)
	{
		cout << parent[i] << ' ';
	}
	cout << '\n';
}