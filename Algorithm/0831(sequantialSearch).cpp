#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>

using namespace std;

int sequantialSearch(int n, string target, vector<string> arr)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == target)
        {
            return i + 1;
        }
    }
    return -1;
}


int n;
string target;
vector<string> arr;




int main(void)
{
    cout << "원소 개수 입력 및 찾을 문자열 입력" << '\n';
    cin >> n >> target;

    cout << "원소 개수 만큼 문자열 입력" << '\n';
    
    for (int i = 0; i < n; i++)
    {
        string x;
        cin >> x;
        arr.push_back(x);
    }

    cout << sequantialSearch(n, target, arr) << '\n';
    
}