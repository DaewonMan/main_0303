#include <stdio.h>
#include <stdlib.h>


void Swap(int arr[], int idx1, int idx2)
{
	int temp = arr[idx1];
	arr[idx1] = arr[idx2];
	arr[idx2] = temp;
}

int Partition(int arr[], int left, int right)
{
	int pivot = left;
	int low = left + 1;
	int high = right;

	while (low <= high)
	{
		while (arr[pivot] > arr[low]) // 피봇보다 큰 값의 인덱스 찾는다.
			low++;
		while (arr[pivot] < arr[high]) // 피봇보다 작은 값의 인덱스 찾는다.
			high--;

		if (low <= high) // 피봇보다 큰 값과 작은 값 교환하여 작은 값이 왼쪽에 큰 값이 오른쪽에 가도록 교환
			Swap(arr, low, high);
	}

	Swap(arr, pivot, high); 

	return high;
}

void QuickSort(int arr[], int left, int right)
{
	int pivot = 0;
	if (left <= right)
	{
		pivot = Partition(arr, left, right);
		QuickSort(arr, left, pivot-1);
		QuickSort(arr, pivot+1, right);
	}
}

int main(void)
{
	int arr[4] = { 3, 2, 4, 1 };
	int i;

	QuickSort(arr, 0, sizeof(arr) / sizeof(int) - 1);

	for (i = 0; i < 4; i++)
		printf("%d ", arr[i]);
	printf("\n");

	return 0;

}