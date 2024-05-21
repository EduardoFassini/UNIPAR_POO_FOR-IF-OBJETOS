package atividade_5.main;
import atividade_5.objetos.Carro;
/*
    Crie um Objeto chamado Carro, definina quais são as suas caracteristicas e metodos e crie uma outra classe
Chamada CarroTeste para criar o objeto e testar
 */

public class CarroTeste {
    public static void main(String[] args) {

        Carro carroTeste = new Carro();
        carroTeste.marca = "Volkswagen";
        carroTeste.ano = 1977;
        carroTeste.modelo = "Fusca";
        carroTeste.cor = "Preto";

        carroTeste.destravar();
        carroTeste.ligar();
        carroTeste.andar();
        carroTeste.desligar();
        carroTeste.travar();


    }
}
