import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();

        for (int i = 0; i <=4; i++) {
            System.out.println("Digite uma cor");
            String cor = sc.nextLine();
            cores.add(cor);
        }
        System.out.println("Listar todas as cores");
        System.out.println();
        System.out.println();
        for (String cor: cores) {
            System.out.println(cor);
        }
        Collections.sort(cores);
        System.out.println("Ordernar as cores");
        System.out.println();
        System.out.println();
        for (String cor: cores) {
            System.out.println(cor);
        }


        sc.close();
    }
}
