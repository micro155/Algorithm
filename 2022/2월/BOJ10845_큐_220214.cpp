#include <iostream>
#include <queue>

using namespace std;

int N;
string arr[10000][2];
queue<int> num_q;

int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> N;

	string str;

	for (int i = 0; i < N; i++) {
		cin >> str;

		int num;

		if (str == "push") {
			cin >> num;
			num_q.push(num);
		}
		else if (str == "pop") {
			if (num_q.empty()) {
				cout << -1 << '\n';
			}
			else {
				cout << num_q.front() << '\n';
				num_q.pop();
			}

		}
		else if (str == "size") {
			cout << num_q.size() << '\n';
		}
		else if (str == "empty") {
			if (num_q.empty()) {
				cout << 1 << '\n';
			}
			else {
				cout << 0 << '\n';
			}
		}
		else if (str == "front") {
			if (num_q.empty()) {
				cout << -1 << '\n';
			}
			else {
				cout << num_q.front() << '\n';
			}
		}
		else {
			if (num_q.empty()) {
				cout << -1 << '\n';
			}
			else {
				cout << num_q.back() << '\n';
			}

		}

	}

	return 0;


}