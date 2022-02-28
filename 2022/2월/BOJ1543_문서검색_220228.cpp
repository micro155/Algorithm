#include <iostream>
#include <string>

using namespace std;

int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string s, word;

	getline(cin, s);
	getline(cin, word);

	int cnt = 0;
	int len = word.length();
	if (s.length() < len) {
		cout << 0;
	}
	else {
		for (int i = 0; i <= s.length() - len; i++) {
			if (s[i] == word[0]) {
				string sub = s.substr(i, len);
				if (sub == word) {
					cnt++;
					i += (len - 1);
				}
			}
		}
		cout << cnt << '\n';
	}

	


	return 0;

}