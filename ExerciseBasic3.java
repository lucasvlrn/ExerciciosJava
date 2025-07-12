import java.util.Scanner;

public class ExerciseBasic3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do retângulo? ");
        var side = scanner.nextDouble();
        System.out.println("Qual o tamanho da base do retângulo? ");
        var base = scanner.nextDouble();
        var area = side * base;
        System.out.printf("A área do retângulo é de %s", area);
    }
}