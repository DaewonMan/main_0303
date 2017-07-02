#include <stdio.h>
#include <stdlib.h>
#include "BinaryTree.h"

BTreeNode * MakeBTreeNode(void) // init
{
	BTreeNode * nd = (BTreeNode *)malloc(sizeof(BTreeNode));
	nd->left = NULL;
	nd->right = NULL;

	return nd;
}

BTData GetData(BTreeNode * bt)
{
	return bt->data;
}

void SetData(BTreeNode * bt, BTData data)
{
	bt->data = data;
}

BTreeNode * GetLeftSubTree(BTreeNode * bt)
{
	return bt->left;
}
BTreeNode * GetRightSubTree(BTreeNode *bt)
{
	return bt->right;
}

void MakeLeftSubTree(BTreeNode * main, BTreeNode * sub)
{
	if (main->left != NULL) // 트리이면 메모리 누수!!
		free(main->left);

	main->left = sub;
}
void MakeRightSubTree(BTreeNode * main, BTreeNode * sub)
{
	if (main->right != NULL) // 트리이면 메모리 누수!!
		free(main->right);

	main->right = sub;
}

void PreorderTraverse(BTreeNode * bt, VisitFuncPtr action)
{
	if (bt == NULL)
		return;
	
	action(bt->data);
	PreorderTraverse(bt->left, action);
	PreorderTraverse(bt->right, action);
}
void PostorderTraverse(BTreeNode * bt, VisitFuncPtr action)
{
	if (bt == NULL)
		return;

	PostorderTraverse(bt->left, action);
	PostorderTraverse(bt->right, action);
	action(bt->data);
}
void InorderTraverse(BTreeNode * bt, VisitFuncPtr action)
{
	if (bt == NULL)
		return;

	InorderTraverse(bt->left, action);
	action(bt->data);
	InorderTraverse(bt->right, action);
}

void DeleteTree(BTreeNode * bt)
{
	
	if (bt == NULL)
		return;
	/*
	else if (bt->left == NULL)
	{
		printf("Del data : %d \n", bt->data);
		free(bt);
		return;
	}
	*/
	DeleteTree(bt->left);
	DeleteTree(bt->right);

	printf("Del data : %d \n", bt->data);
	free(bt);
}