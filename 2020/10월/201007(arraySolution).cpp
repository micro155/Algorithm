#define _CRT_SECURE_NO_WARNINGS
#include <iostream>

using namespace std;

int d[26] = { 0 }; // �ߺ� ���ڿ� ���� Ȯ���� ���� �迭 ���� �� �ʱ�ȭ
bool findnum = false; // �ߺ� ������ false ������ �ʱ�ȭ

int main(void)
{
	string s;

	cin >> s; // ���ڿ� �Է�

	for (int i = 0; i < s.length(); i++)
	{
		int alphabet = s[i] - 'a'; // �Էµ� �ҹ��� ���ĺ��� ���������� ��ȯ�Ͽ� ����
		d[alphabet] += 1; // ���������� ��ȯ�� ���ĺ��� ���ĺ� ������ ����Ͽ� �ش� �迭�� 1�� �߰�
	}

	for (int i = 0; i < 26; i++)
	{
		if (d[i] > 1) // �迭�� ������� Ȯ���Ͽ� �ߺ� ���ĺ��� ������
		{
			findnum = true; // �ߺ��� ���ĺ� Ȯ������ ���� true �� ����
			cout << findnum << '\n'; // ���ڿ��� �ߺ��� ������ ���
			break;
		}
		else // �迭�� ������� Ȯ���Ͽ� �ߺ� ���ĺ��� �ȳ�����
		{
			if (i == 25 && d[i] < 2) // ���ĺ� a���� z���� Ȯ�ΰ�� �ߺ��� ���ڿ��� ������
			{
				cout << findnum << '\n'; // ���ڿ��� �ߺ��� ������ ���
			}
			else
			{
				continue; // �ߺ��� ���ڿ��� ���ö����� �ݺ����� ��� ����
			}
		}
	}

}