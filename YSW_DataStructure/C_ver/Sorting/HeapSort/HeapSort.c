#include <stdio.h>
#include "UsefulHeap.h"

int PriComp(int n1, int n2)
{
	return n2 - n1; // 오름차순
}

void HeapSort(int arr[], int n)
{
	Heap heap;
	int i;

	HeapInit(&heap, PriComp);

	for (i = 0; i < n; i++) // 데이터 삽입
		HInsert(&heap, arr[i]);

	for (i = 0; i < n; i++) // 힙 삭제를 통해 순서대로 데이터를 꺼낸다.
		arr[i] = HDelete(&heap);
}

int main(void)
{
	int arr[4] = { 3, 2, 4, 1 };
	int i;

	HeapSort(arr, sizeof(arr) / sizeof(int));

	for (i = 0; i < 4; i++)
		printf("%d ", arr[i]);
	printf("\n");

	return 0;

}