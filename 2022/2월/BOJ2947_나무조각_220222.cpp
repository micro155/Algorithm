#include <iostream>


using namespace std;

int arr[5];

int main(void) {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	for (int i = 0; i < 5; i++) {
		cin >> arr[i];
	}


	bool check = false;

	for (int i = 0; i < 4; i++) {

		for (int j = 0; j < 4 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				for (int k = 0; k < 5; k++) {
					cout << arr[k] << " ";
				}
				cout << '\n';
			}
		}

			
	}


	return 0;

}