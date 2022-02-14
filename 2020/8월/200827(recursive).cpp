#include <iostream>



using namespace std;

void recursiveFunction(int i) {
	if (i == 100) return;
	cout << i << "번째 재귀 함수에서 " << i + 1 << "번째 재귀함수를 호출합니다." << '\n';
	recursiveFunction(i + 1);
	cout << i << "번째 재귀 함수를 종료합니다." << '\n';
}

int main(void)
{
	recursiveFunction(1);
}