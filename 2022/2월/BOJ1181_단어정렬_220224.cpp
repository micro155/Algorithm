#include <iostream>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;

set<string> str_set;


bool compare(string a, string b) {
	if (a.length() == b.length()) {
		return a < b;
	}
	else {
		return a.length() < b.length();
	}
}

int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	vector<string> v;
	int N;
	string temp;

	cin >> N;

	for (int i = 0; i < N; i++) {
		string str;
		cin >> str;
		v.push_back(str);
	}

	sort(v.begin(), v.end(), compare);


	for (int i = 0; i < N; i++) {
		if (temp == v[i])
			continue;
		cout << v[i] << '\n';
		temp = v[i];
	}


	return 0;

}