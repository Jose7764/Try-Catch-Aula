import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        view viewer = new view();
        funcoes executar = new funcoes();


        while(true) {

            int opcaoMenu = viewer.menu();
            executar.opcoesMenu(opcaoMenu);



        }

    }
}