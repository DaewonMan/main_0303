#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "ALGraphDFS.h"
#include "DLinkedList.h"
#include "ListBaseStack.h"

int WhoIsPrecede(int data1, int data2)
{
	if (data1 < data2)
		return 0;
	else
		return 1;
}

// 그래프의 초기화
void GraphInit(ALGraph * pg, int nv)
{
	int i = 0;

	pg->adjList = (List *)malloc(sizeof(List)*nv);

	pg->numV = nv;
	pg->numE = 0;

	for (i = 0; i < nv; i++)
	{
		ListInit(&pg->adjList[i]);
		SetSortRule(&pg->adjList[i], WhoIsPrecede);
	}

	pg->visitInfo = (int *)malloc(sizeof(int)*nv);

	memset(pg->visitInfo, 0, sizeof(int)*nv);
}

// 그래프의 리소스 해제
void GraphDestroy(ALGraph * pg)
{
	if (pg->adjList != NULL)
		free(pg->adjList);

	// 할당된 배열 소멸!
	if (pg->visitInfo != NULL)
		free(pg->visitInfo);
}

// 간선의 추가
void AddEdge(ALGraph * pg, int fromV, int toV)
{
	LInsert(&pg->adjList[fromV], toV);
	LInsert(&pg->adjList[toV], fromV);

	pg->numE++;
}

// 간선의 정보 출력
void ShowGraphEdgeInfo(ALGraph * pg)
{
	int i;
	int vx = 0;

	for (i = 0; i < pg->numV; i++)
	{
		printf("%c와 연결된 정점: ", i + 65);
		if (LFirst(&pg->adjList[i], &vx))
		{
			printf("%c ", vx + 65);

			while (LNext(&pg->adjList[i], &vx))
				printf("%c ", vx + 65);
		}
		printf("\n");
	}
}

int VisitVertex(ALGraph * pg, int visitV) // 방문정보를 체킹하는 함수
{
	if (pg->visitInfo[visitV] == 0)
	{
		pg->visitInfo[visitV] = 1;
		printf("%c ", visitV + 65);
		return TRUE;
	}

	return FALSE; // 방문 실패
}

// 정점의 정보 출력 : Depth First Search 기반
void DFShowGraphVertex(ALGraph * pg, int startV)
{
	Stack stack;
	int visitV = startV;
	int nextV;

	StackInit(&stack);
	VisitVertex(pg, visitV); // 시작점 방문
	SPush(&stack, visitV); // 시작 정점의 정보를 스택으로

	while (LFirst(&pg->adjList[visitV], &nextV) == TRUE) // 방문 지점에서 연결된 첫번째 지점을 찾는다.
	{
		int visitFlag = FALSE;

		if (VisitVertex(pg, nextV) == TRUE) // 방문에 성공
		{
			SPush(&stack, visitV);
			visitV = nextV;
			visitFlag = TRUE;
		}
		else // 방문에 성공하지 못하면
		{
			while (LNext(&pg->adjList[visitV], &nextV) == TRUE) // 방문 지점에서 연결된 다른 지점을 찾는다.
			{
				if (VisitVertex(pg, nextV) == TRUE) // 방문되지 않은 지점을 찾았을 때
				{
					SPush(&stack, visitV);
					visitV = nextV;
					visitFlag = TRUE;
					break;
				}
			}
		}

		if (visitFlag == FALSE)
		{
			// 스택이 비면 탐색의 시작점으로 되돌아 온 것이다.
			if (SIsEmpty(&stack) == TRUE)
				break;
			else
				visitV = SPop(&stack); // 길을 되돌아 간다.
		}
	}

	// 이후의 탐색을 위해서 탐색 정보 초기화
	memset(pg->visitInfo, 0, sizeof(int) * pg->numV);
}