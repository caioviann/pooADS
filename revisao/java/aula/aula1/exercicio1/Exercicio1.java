package revisao.java.aula1.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String name;
        int birth, currentYear, age;
        System.out.print("Entre com o seu nome: ");
        name = keyboard.nextLine();
        System.out.print("Entre com o ano que nasceu: ");
        birth = keyboard.nextInt();
        System.out.print("Entre com o ano atual: ");
        currentYear = keyboard.nextInt();

        age = currentYear - birth;

        System.out.println(name + " possui " + age + " anos.");
    }
}
