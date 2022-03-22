/* Media 1 */
/*
arquivo: media.c
autor: Vítor Fernandes Marinelli
data: 22/03/22 
descrição: faça a media com dois numeros e com peso diferente
*/
#include<stdio.h>
#define p1 3.5f
#define p2 7.5f
#define soma 11
int main(){
	double a,b,media;
	scanf("%lf %lf",&a,&b);
	media = ((a*p1)+(b*p2))/soma;
	printf("MEDIA = %.5lf\n",media);
	return 0;
}