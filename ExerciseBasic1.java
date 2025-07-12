import java.time.OffsetDateTime;
import java.util.Scanner;

public class ExerciseBasic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var yearNow = OffsetDateTime.now().getYear();
        System.out.println("Qual é o seu nome? ");
        var name = scanner.next();
        System.out.println("Qual é o seu ano de nascimento? ");
        var year = scanner.nextInt();
        var age = yearNow - year;
        System.out.printf("Olá %s você tem %s anos", name, age);
    }
}
