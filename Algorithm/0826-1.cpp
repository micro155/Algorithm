#include <iostream>
#include <string>


using namespace std;


int main(void)
{
	int n, count = 0;

	cin >> n;
	int t[5] = { 0 };


		for (int i = 0; i <= n; i++)
		{
			for (int j = 0; j <= 5; j++)
			{
				for (int k = 0; k <= 9; k++)
				{
					for (int l = 0; l <= 5; l++)
					{
						for (int m = 0; m <= 9; m++)
						{
							if (i == 3 || j == 3 || k == 3 || l == 3 || m == 3)
							{
								count++;
							}
						}
					}
				}
			}
			if (n == 13 || n == 23)
			{
				count++;
			}
		}

	cout << count << '\n';
}
