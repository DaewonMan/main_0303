#include <stdio.h>
#include <stdlib.h>
#include "ListBaseQueue.h"

void QueueInit(Queue * pq)
{
	pq->front = NULL;
	pq->rear = NULL;
	//pq->rear->next = NULL;
}
int QIsEmpty(Queue * pq)
{
	if (pq->front == NULL)
		return TRUE;
	return FALSE;
}

void Enqueue(Queue * pq, Data data)
{
	Node * newNode = (Node *)malloc(sizeof(Node));
	newNode->data = data;

	if (pq->front == NULL)
	{
		pq->front = newNode;
		pq->rear = newNode;
	}
	else
	{
		pq->rear->next = newNode;
		pq->rear = newNode;
	}
}
Data Dequeue(Queue * pq)
{
	if (pq->front == NULL)
	{
		printf("Queue Memory Error!!\n");
		exit(-1);
	}
	Node * delNode = (Node *)malloc(sizeof(Node));
	Data delData = 0;

	delNode = pq->front;
	delData = pq->front->data;

	if (pq->front != pq->rear) // 큐의 노드가 2개 이상일 때
		pq->front = pq->front->next;
	else
	{
		QueueInit(pq); // 다시 초기화
	}
	free(delNode);

	return delData;
}
Data QPeek(Queue * pq)
{
	{
		printf("Queue Memory Error!!\n");
		exit(-1);
	}

	return pq->front->data;
}