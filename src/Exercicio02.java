import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio02 {
    public static void main(String[] args) {
        Set<Integer> setNumber = new HashSet<Integer>();
        setNumber.add(2);
        setNumber.add(5);
        setNumber.add(1);
        setNumber.add(3);
        setNumber.add(4);
        setNumber.add(9);
        setNumber.add(7);
        setNumber.add(8);
        setNumber.add(10);
        setNumber.add(6);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que deseja encontrar: ");
        int numero = sc.nextInt();
        if (setNumber.contains(numero))
            System.out.println("O numero "+numero+" foi encontrado" );
        else
            System.out.println("O numero "+numero+" não foi encontrado" );

        sc.close();

    }
}
