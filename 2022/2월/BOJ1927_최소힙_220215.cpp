#include <iostream>
#include <queue>

using namespace std;


struct cmp {
	bool operator()(int a, int b) {
		return a > b;
	}
};

priority_queue<int, vector<int>, cmp> pq;
int N;


int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> N;

	for (int i = 0; i < N; i++) {
		int num;
		cin >> num;
		if (num == 0) {
			if (pq.empty()) {
				cout << 0 << '\n';
			}
			else {
				cout << pq.top() << '\n';
				pq.pop();
			}
		}
		else {
			pq.push(num);
		}
	}


	return 0;

}