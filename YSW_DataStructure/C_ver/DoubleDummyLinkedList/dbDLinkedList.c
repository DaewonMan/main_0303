#include <stdio.h>
#include <stdlib.h>
#include "dbDLinkedList.h"

void ListInit(List * plist)
{
	plist->head = (Node *)malloc(sizeof(Node)); // head에 더미 노드 가리킨다.
	plist->head->next = NULL;
	plist->tail = (Node *)malloc(sizeof(Node));  // tail에 더미 노드 가리킨다.
	plist->tail->prev = NULL;

	plist->comp = NULL;
	plist->numOfData = 0;
}
void LInsert(List * plist, LData data)
{
	Node * newNode = (Node *)malloc(sizeof(Node));
	newNode->data = data;

	if (plist->head->next == NULL)
	{
		plist->head->next = newNode;
		newNode->prev = plist->head;
	}
	else
	{
		newNode->prev = plist->tail->prev;
		plist->tail->prev->next = newNode;
	}
	newNode->next = plist->tail;
	plist->tail->prev = newNode;

	(plist->numOfData)++;
}
int LFirst(List * plist, LData * pdata)
{
	if (plist->head->next == NULL)
		return FALSE;

	plist->cur = plist->head->next;
	*pdata = plist->cur->data;

	return TRUE;
}
int LNext(List * plist, LData * pdata)
{
	if (plist->cur->next == plist->tail)
		return FALSE;

	plist->cur = plist->cur->next;
	*pdata = plist->cur->data;

	return TRUE;
}
LData LRemove(List * plist)
{
	Node * rNode ;
	LData rData = 0;
	rNode = plist->cur;
	rData = plist->cur->data;

	plist->cur->prev->next = plist->cur->next;
	plist->cur->next->prev = plist->cur->prev;

	plist->cur = plist->cur->prev;

	free(rNode);
	(plist->numOfData)--;

	return rData;
}
int LCount(List * plist)
{
	return (plist->numOfData);
}