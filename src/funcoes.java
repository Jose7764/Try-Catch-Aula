import java.util.InputMismatchException;
import java.util.Scanner;
public class funcoes {
    Scanner input = new Scanner(System.in);

    public void opcoesMenu(int opcaoMenu) {
        switch (opcaoMenu) {

            case 1:
                boolean sairRepeticao1 = true;

                while (sairRepeticao1) {

                    System.out.println("|----------------------------------------|");
                    System.out.println("|   Exercicio 1: Validando um Scanner    |");
                    System.out.println("|----------------------------------------|");

                    System.out.println("| Digite um numero inteiro: ");
                    System.out.print("| - ");
                    String texto1 = input.nextLine();


                    try {
                        int numero1 = Integer.parseInt(texto1);
                        System.out.println("| Você digitou o numero: " + numero1);
                        sairRepeticao1 = false;

                    } catch (Exception e) {
                        System.err.println("| ERRO! , Algo deu errado tente de novo!!");

                    }

                }
                break;

            case 2:
                boolean sairValidacao = true;

                System.out.println("|----------------------------------------|");
                System.out.println("|   Exercicio 2: Validando Soma          |");
                System.out.println("|----------------------------------------|");

                while (sairValidacao) {




                    try {
                        System.out.println("| Digite o primeiro numero:   ");
                        System.out.print("| - ");
                        int n1 = input.nextInt();

                        System.out.println("| Digite o segundo numero:   ");
                        System.out.print("| - ");
                        int n2 = input.nextInt();

                        int somaTotal = n1 + n2;
                        System.out.println("| O resultado da soma é: " + somaTotal);
                        sairValidacao = false;

                    } catch (InputMismatchException erro) {
                        System.err.println("ERRO! , Algo deu errado tente de novo!!");


                    }
                }

            case 3:

                break;

            case 4:

                break;

            case 5:

                System.out.println("|----------------------------------------|");
                System.out.println("|    Exemplo 1: Validando um Scanner     |");
                System.out.println("|----------------------------------------|");

                boolean sairRepeticao = true;

                while (sairRepeticao) {

                    System.out.println("| Digite um numero: ");
                    System.out.print("| - ");
                    String texto2 = input.nextLine();


                    try {
                        int numero2 = Integer.parseInt(texto2);
                        System.out.println("| Você digitou o numero: " + numero2);
                        sairRepeticao = false;

                    } catch (Exception e) {
                        System.err.println("| ERRO! , Algo deu errado tente de novo!!");

                    }

                }

                break;

            case 0:

                break;
        }


    }
}

