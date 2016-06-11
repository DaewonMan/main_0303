#include <iostream>

using namespace std;

void hanoiTowerMove(int num, char from, char by, char to);
int main(void)
{
	hanoiTowerMove(3, 'A', 'B', 'C'); //Move from stick A to stick B 
	return 0;
}

void hanoiTowerMove(int num, char from, char by, char to)
{
	if (num == 1)
	{
		cout << "1번째 원판이 " << from << "에서 " << to << "로 이동!!" << endl;
	}
	else
	{
		hanoiTowerMove(num - 1, from, to, by);
		cout << num << "번째 원판이 " << from << "에서 " << to << "로 이동!!" << endl;
		hanoiTowerMove(num - 1, by, from, to);
	}
}