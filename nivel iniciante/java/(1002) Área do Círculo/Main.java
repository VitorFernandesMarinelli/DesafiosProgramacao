/* Área do Círculo */
/*
arquivo: Main.java
autor: Vítor Fernandes Marinelli
data: 21/03/2022
descrição: dado o raio, retorne o valor da area
*/
import java.util.Scanner;
import java.util.Locale; 
import java.util.Formatter; //para poder formatar saida


public class Main
{
   public static void main(String[] args){
       double raio, pi= 3.141590;
       double area;
       Scanner entrada = new Scanner(System.in);
       entrada.useLocale(Locale.ENGLISH);//faz ele usar "." ao inves da ","
       raio = entrada.nextDouble();
       area = pi * Math.pow(raio,2); //pow(<base>,<expoente>)
       System.out.println("A="+String.format("%.4f", area));//formatação para 4 casas decimais
   }
}
