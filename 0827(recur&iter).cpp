#include <iostream>
#define INF 999999


using namespace std;

int factorialIterative(int n)
{
	int result = 1;
	for (int i = 1; i <= n; i++)
	{
		result *= i;
	}
	return result;
}


int factorialRecursive(int n)
{
	if (n <= 1) return 1;
	return n * factorialRecursive(n - 1);
}


int main(void)
{
	cout << "�ݺ������� ���� " << factorialIterative(5) << '\n';
	cout << "��������� ���� " << factorialRecursive(5) << '\n';
}