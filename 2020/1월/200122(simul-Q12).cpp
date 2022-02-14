#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool possible(vector<vector<int> > answer) {
    for (int i = 0; i < answer.size(); i++) {
        int x = answer[i][0];
        int y = answer[i][1];
        int stuff = answer[i][2];
        if (stuff == 0) {
            bool check = false;

            if (y == 0) {
                check = true;
            }

            for (int j = 0; j < answer.size(); j++) {
                if (x - 1 == answer[j][0] && y == answer[j][1] && 1 == answer[j][2]) {
                    check = true;
                }
                if (x == answer[j][0] && y == answer[j][1] && 1 == answer[j][2]) {
                    check = true;
                }
                if (x == answer[j][0] && y - 1 == answer[j][1] && 0 == answer[j][2]) {
                    check = true;
                }
            }
            if (!check) {
                return false;
            }
        }
        else if (stuff == 1) {
            bool check = false;
            bool left = false;
            bool right = false;

            for (int j = 0; j < answer.size(); j++) {
                if (x == answer[j][0] && y - 1 == answer[j][1] && 0 == answer[j][2]) {
                    check = true;
                }
                if (x + 1 == answer[j][0] && y - 1 == answer[j][1] && 0 == answer[j][2]) {
                    check = true;
                }
                if (x - 1 == answer[j][0] && y == answer[j][1] && 1 == answer[j][2]) {
                    left = true;
                }
                if (x + 1 == answer[j][0] && y == answer[j][1] && 1 == answer[j][2]) {
                    right = true;
                }
            }
            if (left && right) {
                check = true;
            }
            if (!check) {
                return false;
            }
        }
    }
    return true;
}

vector<vector<int>> solution(int n, vector<vector<int>> build_frame) {
    vector<vector<int>> answer;

    for (int i = 0; i < build_frame.size(); i++) {
        int x = build_frame[i][0];
        int y = build_frame[i][1];
        int stuff = build_frame[i][2];
        int operate = build_frame[i][3];
        if (operate == 0) {
            int index = 0;

            for (int j = 0; j < answer.size(); j++) {
                if (x == answer[j][0] && y == answer[j][1] && stuff == answer[j][2]) {
                    index = j;
                }
            }
            vector<int> erased = answer[index];
            answer.erase(answer.begin() + index);
            if (!possible(answer)) {
                answer.push_back(erased);
            }
        }
        if (operate == 1) {

            vector<int> inserted;
            inserted.push_back(x);
            inserted.push_back(y);
            inserted.push_back(stuff);
            answer.push_back(inserted);
            if (!possible(answer)) {
                answer.pop_back();
            }
        }
    }
    sort(answer.begin(), answer.end());

    return answer;
}

