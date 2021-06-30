#include <iostream>
#include <string>

using namespace std;

int solution(string s) {
	int answer = s.size();

	for (int step = 1; step < s.size(); step++) {
		string compressed = "";
		string prev = s.substr(0, step);
		int cnt = 1;

		for (int j = step; j < s.size(); j += step) {
			if (prev == s.substr(j, step)) {
				cnt += 1;
			}
			else {
				compressed += (cnt >= 2) ? to_string(cnt) + prev : prev;
				prev = s.substr(j, step);
				cnt = 1;
			}
		}

		compressed += (cnt >= 2) ? to_string(cnt) + prev : prev;

		answer = min(answer, (int)compressed.size());
	}
	return answer;
}


