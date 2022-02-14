#define _CRT_SECURE_NO_WARNINGS
#include <iostream>

using namespace std;

int d[26] = { 0 }; // 중복 문자열 존재 확인을 위한 배열 선언 및 초기화
bool findnum = false; // 중복 유무를 false 값으로 초기화

int main(void)
{
	string s;

	cin >> s; // 문자열 입력

	for (int i = 0; i < s.length(); i++)
	{
		int alphabet = s[i] - 'a'; // 입력된 소문자 알파벳을 정수형으로 변환하여 저장
		d[alphabet] += 1; // 정수형으로 변환된 알파벳을 알파벳 순서를 고려하여 해당 배열에 1씩 추가
	}

	for (int i = 0; i < 26; i++)
	{
		if (d[i] > 1) // 배열을 순서대로 확인하여 중복 알파벳이 나오면
		{
			findnum = true; // 중복된 알파벳 확인으로 인한 true 값 설정
			cout << findnum << '\n'; // 문자열에 중복이 있음을 출력
			break;
		}
		else // 배열을 순서대로 확인하여 중복 알파벳이 안나오면
		{
			if (i == 25 && d[i] < 2) // 알파벳 a부터 z까지 확인결과 중복된 문자열이 없으면
			{
				cout << findnum << '\n'; // 문자열에 중복이 없음을 출력
			}
			else
			{
				continue; // 중복된 문자열이 나올때까지 반복문을 계속 수행
			}
		}
	}

}