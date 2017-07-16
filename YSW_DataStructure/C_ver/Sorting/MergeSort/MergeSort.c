#include <stdio.h>
#include <stdlib.h>

void MergeTwoArea(int arr[], int left, int mid, int right)
{
	int i ;
	int * t_arr = (int *)malloc(sizeof(int)*(right + 1));
	memset(t_arr, 0, sizeof(int)*(right + 1));

	int f1_index = 0, f2_index = 0, t_index = 0; // 나눠진 부분의 첫 번째에 해당하는 인덱스 할당

	f1_index = left;
	f2_index = mid + 1;
	t_index = left;

	while (f1_index <= mid && f2_index <= right) //두 부분으로 나눠진 인덱스를 비교해서 임시배열에 할당
	{
		if (arr[f1_index] < arr[f2_index])
		{
			t_arr[t_index++] = arr[f1_index++];
		}
		else
		{
			t_arr[t_index++] = arr[f2_index++];
		}
	}

	/* 나머지 할당되지 않은 부분 할당 */
	while (f1_index <= mid)
		t_arr[t_index++] = arr[f1_index++];
	
	while (f2_index <= right)
		t_arr[t_index++] = arr[f2_index++];

	/* 순서대로 정리된 배열을 원래 배열에 할당 */
	for (i = left; i <= right; i++)
		arr[i] = t_arr[i];
	
	free(t_arr);
}

void MergeSort(int arr[], int left, int right)
{
	int mid;

	if (left >= right)
		return;
	else
	{
		mid = (left + right) / 2;

		MergeSort(arr, left, mid);
		MergeSort(arr, mid + 1, right);
		MergeTwoArea(arr, left, mid, right);
	}
}

int main(void)
{
	int arr[4] = { 3, 2, 4, 1};
	int i;

	MergeSort(arr, 0, sizeof(arr) / sizeof(int) - 1);

	for (i = 0; i < 4; i++)
		printf("%d ", arr[i]);
	printf("\n");

	return 0;

}