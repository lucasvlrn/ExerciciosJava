import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe um número para ter sua tabuada de 0 a 10: ");
        var number = scanner.nextInt();
        for (int i = 0; i<=10; i++) {
            System.out.printf("\n %s x %s = %s", number, i, number*i);
        }
    }
}
