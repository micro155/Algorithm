#include <iostream>

using namespace std;

int N, a, b;


int main(void) {

	cin >> N >> a >> b;

	int cnt = 0;

	while (true) {

		if (N % 2 == 1) {
			N = (N / 2) + 1;
		}
		else {
			N /= 2;
		}
		if (a % 2 == 1) {
			a = (a / 2) + 1;
		}
		else {
			a /= 2;
		}
		if (b % 2 == 1) {
			b = (b / 2) + 1;
		}
		else {
			b /= 2;
		}

		cnt++;

		if (a == b) {
			break;
		}
		else if (a > N || b > N) {
			cnt = -1;
			break;
		}

	}

	cout << cnt << '\n';
	
}