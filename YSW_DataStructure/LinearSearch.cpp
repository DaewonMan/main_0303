#include <iostream>
using namespace std;

int LSearch(int arr[], int cnt, int num)
{
	for (int i = 0; i < cnt; i++)
	{
		if (arr[i] == num) return i;
	}
	return -1;
}
int main(void)
{
	int arr[] = {3, 5, 2, 4, 9};
	int idx;

	idx = LSearch(arr, sizeof(arr) / sizeof(int), 4);
	if (idx == -1) cout << "Å½»ö½ÇÆĞ" << endl;
	else cout << "Å¸°Ù ÀúÀå ÀÎµ¦½º: " << idx << endl;

	idx = LSearch(arr, sizeof(arr) / sizeof(int), 7);
	if (idx == -1) cout << "Å½»ö½ÇÆĞ" << endl;
	else cout << "Å¸°Ù ÀúÀå ÀÎµ¦½º: " << idx << endl;

	return 0;
}