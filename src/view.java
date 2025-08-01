
import java.util.Scanner;

public class view {
    Scanner input = new Scanner(System.in);
    public int  menu(){

        System.out.println("|----------------------------------------|");
        System.out.println("|               TRY CATCH                |");
        System.out.println("|----------------------------------------|");
        System.out.println("| 1 - Exercicio 01                       |");
        System.out.println("| 2 - Exercicio 02                       |");
        System.out.println("| 3 - Exercicio 03                       |");
        System.out.println("| 4 - Exercicio 04                       |");
        System.out.println("| 5 - Exemplo 05                         |");
        System.out.println("|                                        |");
        System.out.println("|                              5 - sair  |");
        System.out.println("|----------------------------------------|");
        System.out.print("| - ");
        int opcao = input.nextInt();

        return opcao;
    }
}
