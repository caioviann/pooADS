package revisao.java.aula.aula1.exercio2;

import java.util.Scanner;

public class Exercicio2 {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double p1, p2,media;
        int frequencia;

        System.out.print("Entre com a nota do projeto 1: ");
        p1 = keyboard.nextDouble();
        System.out.print("Entre com a nota do projeto 2: ");
        p2 = keyboard.nextDouble();


        System.out.print("Entre com a sua frequência em (%): ");
        frequencia = keyboard.nextInt();

        if (frequencia >= 75) {
            media = (p1 + p2) / 2;
            if(media >= 6){
                System.out.println("Aprovado! sua Nota é: " + media);
            } else {
                System.out.println("Reprovado! sua Nota é: " + media);
            }
        } else {
            System.out.println("Reprovado por frequência insuficiente! Nota 0");
        }
    }
}

