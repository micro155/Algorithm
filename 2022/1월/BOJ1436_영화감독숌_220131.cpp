#include <iostream>
#include <string>

using namespace std;


int main(void) {

	int N;
	int cnt = 0;
	int title = 665;
	string s;

	cin >> N;

	while (cnt < N) {

		title++;
		s = to_string(title);
		if (s.find("666") != -1) {
			cnt++;
		}

	}
	
	cout << title << '\n';

	return 0;

}