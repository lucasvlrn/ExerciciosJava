import java.util.Scanner;

public class ExerciseBasic4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        var name1 = scanner.next();
        System.out.println("Qual a sua idade?");
        var age1 = scanner.nextInt();
        System.out.println("Qual o seu nome? ");
        var name2 = scanner.next();
        System.out.println("Qual a sua idade? ");
        var age2 = scanner.nextInt();
        var diff = age1 - age2;
        if (diff < 0) {
            diff /= -1;
        }
        System.out.printf("A diferença de idade é de %s", diff);
    }
}