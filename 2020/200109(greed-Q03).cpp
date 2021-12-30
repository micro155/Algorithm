#include <iostream>

using namespace std;

string s;

int count0 = 0;
int count1 = 0;

int main(void)
{
	cin >> s;

	if (s[0] == '0') {
		count0 += 1;
	}
	else {
		count1 += 1;
	}

	for (int i = 0; i < s.size(); i++) {
		if (s[i] != s[i + 1]) {
			if (s[i + 1] == '1') {
				count1 += 1;
			}
			else {
				count0 += 1;
			}
		}
	}


	cout << min(count0, count1) << '\n';
	
}

