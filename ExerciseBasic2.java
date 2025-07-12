import java.util.Scanner;

public class ExerciseBasic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do quadrado?");
        var side = scanner.nextDouble();
        var area = side * side;
        System.out.printf("A área do quadrado é de %s", area);
    }
}
