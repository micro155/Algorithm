#include <iostream>

using namespace std;

int n;
int ugly[1000];


int main(void)
{
	cin >> n;

	int i2 = 0, i3 = 0, i5 = 0;

	int next2 = 2, next3 = 3, next5 = 5;

	ugly[0] = 1;

	for (int j = 1; j < n; j++) {
		ugly[j] = min(next2, min(next3, next5));

		if (ugly[j] == next2) {
			i2 += 1;
			next2 = ugly[i2] * 2;
		}
		if (ugly[j] == next3) {
			i3 += 1;
			next3 = ugly[i3] * 3;
		}
		if (ugly[j] == next5) {
			i5 += 1;
			next5 = ugly[i5] * 5;
		}
	}

	cout << ugly[n - 1] << '\n';


}




