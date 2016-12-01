/*
   hot blood data structure
   Problem : 03-2
*/
#include <stdio.h>
#include <stdlib.h>
#include "ArrayList.h"
#include "NameCard.h"

int main(void)
{
	List list;
	NameCard nc;
	NameCard * pp;

	ListInit(&list);

	/** 데이터 저장 **/
	//pp = (NameCard *)malloc(sizeof(NameCard));
	pp = MakeNameCard("James jo", "010-1111-2222");
	LInsert(&list, pp);

	//pp = (NameCard *)malloc(sizeof(NameCard));
	pp = MakeNameCard("mike kim", "010-2222-3333");
	LInsert(&list, pp);

	//pp = (NameCard *)malloc(sizeof(NameCard));
	pp = MakeNameCard("chals lee", "010-3333-4444");
	LInsert(&list, pp);

	/** 저장된 데이터의 수 출력 **/
	printf("현재 데이터의 수 : %d \n", LCount(&list));

	if (LFirst(&list, &pp))
	{
		ShowNameCardInfo(pp);

		while (LNext(&list, &pp))
			ShowNameCardInfo(pp);
	}
	printf("\n");
	/** mike kim의 정보 찾아 출력 **/
	printf("mike kim의 정보\n");
	if (LFirst(&list, &pp))
	{
		if (NameCompare(pp, "mike kim") == 0)
			ShowNameCardInfo(pp);
		while (LNext(&list, &pp))
		{
			if (NameCompare(pp, "mike kim") == 0)
				ShowNameCardInfo(pp);
		}
	}
	printf("\n");

	/** mike kim의 정보 찾아 전화번호 변경 **/
	printf("mike kim의 정보 찾아 전화번호 변경\n");
	if (LFirst(&list, &pp))
	{
		if (NameCompare(pp, "mike kim") == 0)
			ChangePhoneNum(pp, "010-9999-9999");
		while (LNext(&list, &pp))
		{
			if (NameCompare(pp, "mike kim") == 0)
				ChangePhoneNum(pp, "010-9999-9999");
		}
	}
	printf("\n");

	/** chals lee의 정보 찾아 삭제 **/
	printf("chals lee의 정보 찾아 삭제\n");
	if (LFirst(&list, &pp))
	{
		if (NameCompare(pp, "chals lee") == 0)
			LRemove(&list);
		while (LNext(&list, &pp))
		{
			if (NameCompare(pp, "chals lee") == 0)
				LRemove(&list);
		}
	}

	/** 저장된 데이터의 수 출력 **/
	printf("현재 데이터의 수 : %d \n", LCount(&list));

	if (LFirst(&list, &pp))
	{
		ShowNameCardInfo(pp);

		while (LNext(&list, &pp))
			ShowNameCardInfo(pp);
	}
	printf("\n");

	return 0;
}

