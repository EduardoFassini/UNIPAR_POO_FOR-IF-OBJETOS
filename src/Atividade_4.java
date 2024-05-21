import java.util.Scanner;

/*
Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200
 */
public class Atividade_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int num_Entre_0_E_100 = 0;
        int num_Entre_101_E_200 = 0;
        int num_Maior_Que_200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o "+(i+1)+"° número:");
            numeros[i] = sc.nextInt();
            if(numeros[i]<101){
                num_Entre_0_E_100++;
            } else if (numeros[i]>100 && numeros[i]<201) {
                num_Entre_101_E_200++;
            }
            else {
                num_Maior_Que_200++;
            }
        }
        System.out.println(" ");
        System.out.println("Quantidade de número(s) entre 0 e 100: "+num_Entre_0_E_100);
        System.out.println("Quantidade de número(s) entre 101 e 200: "+num_Entre_101_E_200);
        System.out.println("Quantidade de número(s) maior(es) que 200: "+num_Maior_Que_200);
    }
}
