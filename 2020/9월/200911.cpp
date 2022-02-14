#define _CRT_SECURE_NO_WARNINGS
#include <iostream>


using namespace std;


int n;

int table[15][2] = { 0 };

int maxint[15] = { 0 };

int maximum = 0;


int main(void)
{

	cin >> n;


	for (int i = 0; i < n; i++)
	{
		cin >> table[i][0] >> table[i][1];
	}

	for (int i = 0; i < n; i++)
	{
		int date = i;
		int benefit = 0;

		while (date <= n)
		{
			int date2 = table[date][0];

			if (date2 == 0)
			{
				break;
			}
			else
			{
				benefit += table[date][1];
				date = date + (date2 - 1);
			}
		}
		maxint[i] = benefit;
	}

	for (int i = 0; i < n; i++)
	{
		if (maximum < maxint[i])
		{
			maximum = maxint[i];
		}
	}


	cout << maximum << '\n';
}