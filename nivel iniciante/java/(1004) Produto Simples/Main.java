/* produto simples */
/*
arquivo: Main.java
autor: Vítor Fernandes Marinelli
data: 21/03/2022
descrição: realiza o produto de dois valores
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        int a,b,prod;
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextInt();
        b = entrada.nextInt();
        prod = a*b;
        System.out.print("PROD = "+prod+"\n");
    }
}
