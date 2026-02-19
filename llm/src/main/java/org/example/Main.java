package org.example;
import java.util.Scanner;
import calculadora.Calculadora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao;

        System.out.println("=== CALCULADORA EM JAVA ===");

        do {
            // Menu principal
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Verificar se número é par");
            System.out.println("6. Calcular fatorial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Operação de soma
                    System.out.println("\n--- SOMAR ---");
                    System.out.print("Digite o primeiro número: ");
                    int a1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int b1 = scanner.nextInt();
                    int resultadoSoma = calc.somar(a1, b1);
                    System.out.println("Resultado: " + a1 + " + " + b1 + " = " + resultadoSoma);
                    break;

                case 2:
                    // Operação de subtração
                    System.out.println("\n--- SUBTRAIR ---");
                    System.out.print("Digite o primeiro número: ");
                    int a2 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int b2 = scanner.nextInt();
                    int resultadoSub = calc.subtrair(a2, b2);
                    System.out.println("Resultado: " + a2 + " - " + b2 + " = " + resultadoSub);
                    break;

                case 3:
                    // Operação de multiplicação
                    System.out.println("\n--- MULTIPLICAR ---");
                    System.out.print("Digite o primeiro número: ");
                    int a3 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int b3 = scanner.nextInt();
                    int resultadoMult = calc.multiplicar(a3, b3);
                    System.out.println("Resultado: " + a3 + " x " + b3 + " = " + resultadoMult);
                    break;

                case 4:
                    // Operação de divisão (com tratamento de erro)
                    System.out.println("\n--- DIVIDIR ---");
                    System.out.print("Digite o dividendo: ");
                    int a4 = scanner.nextInt();
                    System.out.print("Digite o divisor: ");
                    int b4 = scanner.nextInt();

                    try {
                        int resultadoDiv = calc.dividir(a4, b4);
                        System.out.println("Resultado: " + a4 + " ÷ " + b4 + " = " + resultadoDiv);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 5:
                    // Verificar se é par
                    System.out.println("\n--- VERIFICAR PAR/ÍMPAR ---");
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    boolean par = calc.isPar(numero);

                    if (par) {
                        System.out.println(numero + " é PAR");
                    } else {
                        System.out.println(numero + " é ÍMPAR");
                    }
                    break;

                case 6:
                    // Calcular fatorial
                    System.out.println("\n--- CALCULAR FATORIAL ---");
                    System.out.print("Digite um número (não negativo): ");
                    int n = scanner.nextInt();

                    try {
                        int resultadoFat = calc.fatorial(n);
                        System.out.println(n + "! = " + resultadoFat);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando a calculadora. Até mais!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}