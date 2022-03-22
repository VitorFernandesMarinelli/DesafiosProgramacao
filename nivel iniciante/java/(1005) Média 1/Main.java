/* Media 1 */
/*
arquivo: main.java
autor: Vítor Fernandes Marinelli
data: 22/03/22 
descrição: faça a media com dois numeros e com peso diferente
*/
import java.util.Scanner;
import java.util.Formatter; //para poder formatar saida
import java.util.Locale; 
public class Main
{
   public static void main(String[] args){
       double a,b,media;
       float p1 = 3.5f, p2 = 7.5f, soma = 11.0f;
       Scanner entrada = new Scanner(System.in);
       entrada.useLocale(Locale.ENGLISH);//faz ele usar "." ao inves da ","
       a = entrada.nextDouble();
       b = entrada.nextDouble();
       media = ((a*p1)+(b*p2))/soma;
       System.out.println("MEDIA = "+String.format("%.5f", media));//formatação para 4 casas decimais
   }
}
