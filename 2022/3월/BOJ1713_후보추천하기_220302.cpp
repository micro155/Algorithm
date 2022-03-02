#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int N, M;
int student[110];
int term[110];
vector<int> v;


bool compare(int a, int b) {
	if (student[a] == student[b]) {
		if (term[a] < term[b]) {
			return true;
		}
		else {
			return false;
		}
	}
	else if (student[a] > student[b]) {
		return true;
	}
	else {
		return false;
	}
}

int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> N >> M;

	
	for (int i = 0; i < M; i++) {
		int num;
		cin >> num;

		student[num]++;

		for (int j = 0; j < v.size(); j++) {
			term[v[j]]++;
		}

		bool exist = false;

		for (int j = 0; j < v.size(); j++) {
			if (num == v[j]) {
				exist = true;
				break;
			}
		}

		if (!exist) {
			if (v.size() < N) {
				v.push_back(num);
			}
			else {
				sort(v.begin(), v.end(), compare);
				student[v.back()] = 0;
				term[v.back()] = 0;
				v.back() = num;
			}
		}

	}

	sort(v.begin(), v.end());

	for (int i = 0; i < v.size(); i++) {
		cout << v[i] << ' ';
	}
	cout << '\n';

	return 0;

}