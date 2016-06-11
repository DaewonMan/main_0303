/* 
   순차탐색 연산횟수와 비교
   n = 500
   n = 5000
   n = 50000 일때 
   이진탐색 알고리즘의 연산횟수를 알아보자!
*/

#include <iostream>

using namespace std;

int BSearch(int arr[], int id, int target)
{
	int first = 0;
	int last = id - 1;
	int mid = 0;
	int cnt = 0;

	while (first <= last) 
	{
		mid = (first + last) / 2;
		if (arr[mid] == target) return mid; // 타겟을 찾으면 인덱스 반환
		else if (arr[mid] > target) last = mid - 1;
		else first = mid + 1;
		cnt++; // 연산횟수 증가
	}
	cout << "연산횟수 : " << cnt << endl;
	return -1;
}
int main(void)
{
	int arr1[500] = {0, };
	int arr2[5000] = {0, };
	int arr3[50000] = {0, };
	int idx;

	idx = BSearch(arr1, sizeof(arr1)/sizeof(int), 1); // 배열arr1을 대상으로 1을 찾아라

	if (idx == -1) cout << "탐색실패" << endl;
	else cout << "타겟 저장 인덱스 : " << idx << endl;
	
	idx = BSearch(arr2, sizeof(arr2) / sizeof(int), 1); // 배열arr2를 대상으로 1을 찾아라

	if (idx == -1) cout << "탐색실패" << endl;
	else cout << "타겟 저장 인덱스 : " << idx << endl;

	idx = BSearch(arr3, sizeof(arr3) / sizeof(int), 1); // 배열 arr3을 대상으로 1을 찾아라

	if (idx == -1) cout << "탐색실패" << endl;
	else cout << "타겟 저장 인덱스 : " << idx << endl;

	return 0;
}