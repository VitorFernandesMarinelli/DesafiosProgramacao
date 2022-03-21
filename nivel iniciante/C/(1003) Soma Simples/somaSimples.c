/* Soma Simples */
/*
arquivo: somaSimples.c
autor: Vítor Fernandes Marinelli
data: 21/03/2022
descrição: realizar a soma de dois valores inteiros
*/

#include <stdio.h>
int main(){
	int a,b,soma;
	scanf("%d %d",&a,&b);
	soma = a + b;
	printf("SOMA = %d\n",soma);
	return 0;
}