import java.util.Scanner;

/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */
public class Atividade_3 {
    public static void main(String[] args) {

        System.out.println("Digite sua idade em anos:");
        Scanner sc = new Scanner(System.in);
        int anos = sc.nextInt();

        System.out.println("E quantos meses?");
        int meses = sc.nextInt();

        System.out.println("E quantos dias?");
        int dias = sc.nextInt();

        int total_Dias = (anos*365)+(meses*30)+dias;
        System.out.println("Sua idade resulta em "+total_Dias+" dias.");
    }
}
