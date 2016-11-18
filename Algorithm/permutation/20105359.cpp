/****************************************************************
*																*
* Problem :														*
*		정렬된 순열 구하기										*
*																*
****************************************************************/

/****************************************************************
*																*
* 국민대학교 전자정보통신대학 컴퓨터공학부 4 학년				*
*												20105359 김대원	*
*																*
****************************************************************/
#include <iostream>
#include <cstdlib>
#include <fstream>
using namespace std;
char perarr[13];
int index = 0;

int fac(int n)
{
	if (n <= 1) // base case
		return 1;
	else // recursive step
		return n*fac(n - 1);
}
void permutation(char * arr, int n, int o)
{
	int f = 0, share = 0, remnant = 0;

	for (int i = n; i > 0; i--)
	{
		f = fac(i - 1); // 각 고정된 알파벳에서의 case num 할당
		share = (o - 1) / f; // 몫은 곧 고정 알파벳 인덱스
		o -= share * f;
		while (1)
		{
			if (arr[share] != 'z')
			{
				perarr[index++] = arr[share];
				arr[share] = 'z';
				break;
			}
			share++;
		}
		// 선택정렬로 알파벳 정렬
		for (int j = 0; j < n-1;j++)
		{
			char temp = 0;
			for (int k = j + 1; k < n; k++)
			{
				if (arr[j] > arr[k])
				{
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
	}
	index = 0;
}

int main(void)
{
	ifstream inStream;
	int numTestCases = 0;
	int num = 0, order = 0;

	// 파일 오픈 및 오픈 실패 시 예외처리
	inStream.open("input.txt");
	if (inStream.fail())
	{
		cerr << "Input file opening failed. \n";
		exit(1);
	}
	// 반복 횟수 입력
	inStream >> numTestCases;
	for (int i = 0; i < numTestCases; i++)
	{
		inStream >> num >> order; // 개수와 순서를 입력
		char alpha[13] = "abcdefghijkl";
		char arr[13] = "";
		// 입력 갯수 만큼 알파벳 할당
		for (int i = 0; i < num; i++) arr[i] = alpha[i];
		//결과 출력
		permutation(arr, num, order);
		cout << perarr << endl;
		// 전역변수 초기화
		for (int i = 0; i < num; i++) perarr[i] = ' ';
	}
	inStream.close();
	return 0;
}
