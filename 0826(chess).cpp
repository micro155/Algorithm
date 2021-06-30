#include <iostream>
#include <string>


using namespace std;


int main(void)
{
	string c;
	int count = 0;
	int cc, cn;

	int steps[8][2] = { {1,2}, {-1,2}, {1,-2},{-1,-2},{2,1},{-2,1},{2,-1},{-2,-1} };

	cin >> c;


	for (int i = 0; i < 8; i++)
	{
		int row = c[1] - '0';
		int col = c[0] - 'a' + 1;
		col += steps[i][0];
		row += steps[i][1];

		if (col > 0 && col < 9 && row > 0 && row < 9)
		{
			count++;
		}
	}


	cout << count << '\n';
	return 0;
}
