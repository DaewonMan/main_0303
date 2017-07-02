#include <stdio.h>
#include "ExpressionTree.h"

int main(void)
{
	char exp[] = "12+7*";
	BTreeNode * eTree = MakeExpTree(exp);

	printf("Prefix\n");
	ShowPrefixTypeExp(eTree);
	printf("\n");

	printf("Infix\n");
	ShowInfixTypeExp(eTree);
	printf("\n");

	printf("Postfix\n");
	ShowPostfixTypeExp(eTree);
	printf("\n");

	printf("연산 결과 : %d \n",  EvaluateExpTree(eTree));

	return 0;
}