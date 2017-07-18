#include <stdio.h>
#include <stdlib.h>
#include "Table2.h"
#include "DLinkedList2.h"

// 테이블 초기화
void TBLInit(Table * pt, HashFunc * f)
{
	int i;

	for (i = 0; i < MAX_TBL; i++)
	{
		ListInit(&pt->tbl[i]);
	}

	pt->hf = f;
}

// 테이블에 키와 값을 저장
void TBLInsert(Table * pt, Key k, Value v)
{
	int h_val = pt->hf(k);
	Slot st = {k, v};

	LInsert(&pt->tbl[h_val], st);
}

// 키를 근거로 테이블에서 데이터 삭제
Value TBLDelete(Table * pt, Key k)
{
	int h_val = pt->hf(k);
	Slot st;


	if (LFirst(&pt->tbl[h_val], &st))
	{
		if (st.key == k)
		{
			LRemove(&pt->tbl[h_val]);
			return st.val;
		}
		else
		{
			while (LNext(&pt->tbl[h_val], &st))
			{
				if (st.key == k)
				{
					LRemove(&pt->tbl[h_val]);
					return st.val;
				}
			}
		}
	}
	else
		return NULL;

}

// 키를 근거로 테이블에서 데이터 탐색
Value TBLSearch(Table * pt, Key k)
{
	int h_val = pt->hf(k);
	Slot st;

	
	if (LFirst(&pt->tbl[h_val], &st))
	{
		if (st.key == k)
			return st.val;
		else
		{
			while (LNext(&pt->tbl[h_val], &st))
			{
				if (st.key == k)
					return st.val;
			}
		}
	}
	else
		return NULL;
}