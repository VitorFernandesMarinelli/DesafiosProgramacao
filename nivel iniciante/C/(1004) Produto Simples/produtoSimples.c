/* produto simples */
/*
arquivo: produtoSimples.c
autor: Vítor Fernandes Marinelli
data: 21/03/2022
descrição: realiza o produto de dois valores
*/

#include <stdio.h>

int main (){
	int a,b,prod;
	scanf("%d %d",&a,&b);
	prod = a*b;
	printf("PROD = %d\n",prod);
	return 0;
}