/* Soma Simples */
/*
arquivo: Main.java
autor: Vítor Fernandes Marinelli
data: 21/03/2022
descrição: realizar a soma de dois valores inteiros
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        int soma, a,b;
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextInt();
        b = entrada.nextInt();
        soma = a + b;
        System.out.print("SOMA = "+ soma +"\n");
    }
}
