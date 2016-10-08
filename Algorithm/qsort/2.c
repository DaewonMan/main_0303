// 오름차순
int compare(void *first, void *second)
{
	if (*(int*)first > *(int*)second)
		return 1;
	else if (*(int*)first < *(int*)second)
		return -1;
	else
		return 0;
}

int main(int argc, char** argv)
{
	int arr[] = { 4, 3, 1, 7, 5, 9, 8, 2, 6 };
	int arr_size = sizeof(arr) / sizeof(int);
	int i;

	// before sort
	for (i = 0; i < arr_size; i++)
		printf("%d ", arr[i]);
	printf("\n");

	// apply quick sort
	qsort(arr, arr_size, sizeof(int), compare);

	// after sort
	for (i = 0; i < arr_size; i++)
		printf("%d ", arr[i]);
	printf("\n");

	return 0;
}