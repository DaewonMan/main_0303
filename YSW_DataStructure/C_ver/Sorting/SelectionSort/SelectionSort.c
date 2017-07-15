#include <stdio.h>

void SelSort(int arr[], int n)
{
	int i, j, t = 0;
	int temp = 0;

	for (i = 0; i < n-1; i++)
	{
		t = i;
		for (j = i + 1; j < n; j++)
		{
			if (arr[t] > arr[j])
			{
				t = j;
			}
		}
		temp = arr[i];
		arr[i] = arr[t];
		arr[t] = temp;
	}
}

int main(void)
{
	int arr[4] = { 3, 2, 4, 1 };
	int i;

	SelSort(arr, sizeof(arr) / sizeof(int));

	for (i = 0; i < 4; i++)
		printf("%d ", arr[i]);
	printf("\n");

	return 0;

}