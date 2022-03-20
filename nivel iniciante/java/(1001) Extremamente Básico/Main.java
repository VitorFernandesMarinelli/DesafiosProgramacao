/* Extremamente Básico */
/*
arquivo: Main.java
autor: Vítor Fernandes Marinelli
data: 20/03/2022
descrição: pegue dois valores inteiros e devolvar o valor da soma entre esse dois numeros
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        int A,B,X;
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextInt();
        B = entrada.nextInt();
        X = A + B;
        System.out.print("X = "+X+"\n");
    }
}
