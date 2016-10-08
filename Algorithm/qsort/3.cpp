#include<iostream>
#include<stdlib.h>

using namespace std;

//form of sort function required by qsort()
int sortFunction(const void *intOne, const void *intTwo)
{
	int a = *((int*)intOne);
	int b = *((int*)intTwo);

	if (a < b) // 오름차순
	{
		return -1;
	}
	else if (a > b)
	{
		return 1;
	}
	/* 내림차순
	if (a > b) return -1;
	else if(a < b) return 1;
	*/
	
	return 0;
}


int main()
{
	int i, table[10] = {1, 5, 8, 5, 6, 9, 4, 7, 3, 2 };

	int tableSize = sizeof(table) / sizeof(int);

	//sort values
	qsort((void*)table, tableSize, sizeof(int), sortFunction);

	//print the results
	for (i = 0; i < tableSize; i++)
	{
		cout << table[i] << " ";
	}
	cout << endl;

	return 0;
}
