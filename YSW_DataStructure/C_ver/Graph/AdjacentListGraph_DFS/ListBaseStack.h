#ifndef __LB_STACK_H__
#define __LB_STACK_H__

#include "DLinkedList.h"

#define TRUE 1
#define FALSE 0

typedef int Data;
/*
typedef struct _node
{
	Data data;
	struct _node * next;
} Node;
*/
typedef struct _listStack
{
	Node * head;

} ListStack;

typedef ListStack Stack;

void StackInit(Stack * pstack); // 스택 초기화
int SIsEmpty(Stack * pstack); // 스택이 비었는지 확인

void SPush(Stack * pstack, Data data); // 스택의 push 연산
Data SPop(Stack * pstack);
Data SPeek(Stack * pstack);


#endif