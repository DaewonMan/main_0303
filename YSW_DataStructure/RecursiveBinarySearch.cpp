/*
  A Simple Binary Search algorithm using recursion
*/
#include <iostream>

using namespace std;

void BSearchRecur(int arr[], int first, int last, int target);

int main(void)
{
	int arr[] = {1, 3, 5, 7, 9};
	BSearchRecur(arr, 0, sizeof(arr) / sizeof(int) - 1, 7);
	BSearchRecur(arr, 0, sizeof(arr) / sizeof(int) - 1, 4);
	return 0;
}

void BSearchRecur(int arr[], int first, int last, int target)
{
	int mid = (first + last) / 2; // index mid value assign
	if (first > last) cout << "검색 결과 : 없음!!" << endl; /*base case*/
	else if (arr[mid] == target) cout << "검색 결과 : " << mid << "번째 인덱스" << endl; 
	else if (arr[mid] > target) BSearchRecur(arr, first, mid - 1, target); /*recursive step*/
	else BSearchRecur(arr, mid+1, last, target);
}