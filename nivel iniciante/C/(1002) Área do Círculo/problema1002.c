/* Área do Círculo */
/*
arquivo: problema1002.c
autor: Vítor Fernandes Marinelli
data: 20/03/2022
descrição: dado o raio, retorne o valor da area
*/

#include <stdio.h>
#include <math.h> //usei por causa do pow(<base>,<expoente>), ou poderia fazer raio*raio   
#define pi 3.14159 //esse foi o valor dado pelo problema
int main(){
	double raio,area; 
	scanf("%lf",&raio);
	area = pi*(pow(raio,2));
	printf("A=%.4lf\n",area);
	return 0;
}