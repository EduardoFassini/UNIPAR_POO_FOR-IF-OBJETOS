import java.util.Scanner;

/*
2. **Programa em Java dos patinhos da Xuxa**
        Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:
    n patinhos foram passear
    Além das montanhasPara brincar
    A mamãe gritou: Quá, quá, quá, quá*
    Mas só n-1 patinhos voltaram de lá*
        Que se repete até nenhum patinho voltar de lá.
        Ao final, todos os patinhos voltam:
    A mamãe patinha foi procurar
    Além das montanhas Na beira do mar
    A mamãe gritou: Quá, quá, quá, quá
    E os n patinhos voltaram de lá.*
        Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a música
        inteira na tela, onde o inteiro recebido representa o número inicial n de patinhos que
        foram passear.
 */
public class Atividade_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de patinhos");
        int n = sc.nextInt();
        int i = n;

        for (; n >= 0; n--) {
            if(n>0) {
                if(n>1) {
                System.out.println(n + " patinhos foram passear");
                }
                else{
                    System.out.println("1 patinho foi passear");
                }
                System.out.println("Além das montanhas para brincar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá");
                if((n-1)>1) {
                    System.out.println("Mas só " + (n - 1) + " patinhos voltaram de lá");
                }
                else {
                    if ((n-1) == 1) {
                        System.out.println("Mas só 1 patinho voltou de lá");
                    } else {
                        System.out.println("Mas nenhum patinho voltou de lá");
                    }
                }
                System.out.println(" ");
            }
            else{
                System.out.println("A mamãe patinha foi procurar");
                System.out.println("Além das montanhas na beira do mar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá");
                System.out.println("E os "+i+" patinhos voltaram de lá.");
                System.out.println(" ");
            }
        }
    }
}
