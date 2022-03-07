#include <iostream>


using namespace std;

string str;
string result_str;


int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> str;

	if (str.length() == 1 && str[0] == 'X') {
		cout << -1 << '\n';
		return 0;
	}

	int i = 0;
	int cnt = 0;

	while (str[i] != '\0') {

		while (str[i] == 'X' || str[i] != '.') {
			i++;
			cnt++;

			if (str[i] == '\0')
				break;
		}

		if (cnt % 2 == 0) {
			while (4 <= cnt) {
				result_str += "AAAA";
				cnt -= 4;
			}
			while (2 <= cnt) {
				result_str += "BB";
				cnt -= 2;
			}
		}

		if (cnt != 0) {
			cout << -1 << '\n';
			return 0;
		}

		if (str[i] == '.') {
			result_str += ".";
			i++;
		}
	}

		cout << result_str << '\n';

}