package Projeto_Java.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //DECLARANDO AS VARIAVEIS DO TIPO FUNCIONARIO
        Funcionario f1, f2;

        //INSTACIANDO OS ( OU CRIANDO) OBJETOS
        f1 = new Funcionario();
        f2 = new Funcionario();

        System.out.println("Dados do primreiro funcionario: ");
        f1.nome = scan.next();
        f1.valorPorHora = scan.nextDouble();
        f1.horas = scan.nextInt();

        System.out.println("Dados do segundo funcionario:");
        f2.nome = scan.next();
        f2.valorPorHora = scan.nextDouble();
        f2.horas = scan.nextInt();


        double total = f1.total() + f2.total();

        System.out.printf("Valor total = %.2f%n",total );
    }
}
