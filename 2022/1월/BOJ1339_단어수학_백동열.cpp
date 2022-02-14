#include <iostream>
#include <algorithm>
#include <cstring>

using namespace std;

char arr[10][10];
int len[10];
int alpha[26];


bool desc(int a, int b) {
	return a > b;
}

int main(void) {

	int N;

	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> arr[i];
		len[i] = strlen(arr[i]);
	}

	for (int i = 0; i < N; i++) {
		int sum = 1;
			for (int j = len[i] - 1; j >= 0; j--) {
				alpha[arr[i][j] - 'A'] += sum;
				sum *= 10;
			}
	}

	sort(alpha, alpha + 26, desc);

	int result = 0;
	for (int i = 0; i < 10; i++) {
		result += alpha[i] * (9 - i);
	}

	cout << result << '\n';

}