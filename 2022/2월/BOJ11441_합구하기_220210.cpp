#include <iostream>
#include <vector>

using namespace std;

int N, M;


int main(void) {

	cin >> N;

	vector<int> v(N + 1, 0);
	vector<int> result;

	int num;
	int sum = 0;
	for (int i = 1; i <= N; i++) {
		cin >> num;
		sum += num;
		v[i] = sum;
	}

	cin >> M;

	for (int i = 0; i < M; i++) {
		int start, end;
		cin >> start >> end;
		
		int sum = v[end] - v[start - 1];
		
		result.push_back(sum);
	}

	for (int i = 0; i < M; i++)
		cout << result[i] << '\n';
	
}