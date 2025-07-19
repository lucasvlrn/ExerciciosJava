import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        var height = scanner.nextFloat();
        System.out.print("Informe seu peso: ");
        var weight = scanner.nextFloat();
        var bmi = weight / (height*height);
        if (bmi <= 18.5) System.out.println("Abaixo do peso");
        if (bmi >= 18.6 && bmi <= 24.9) System.out.println("Peso ideal");
        if (bmi >= 25.0 && bmi <= 29.9) System.out.println("Levemente acima do peso");
        if (bmi >= 30.0 && bmi <= 34.9) System.out.println("Obesidade Grau I");
        if (bmi >= 35.0 && bmi <= 39.9) System.out.println("Obesidade Grau II (Severa)");
        if (bmi >= 40.0) System.out.println("Obesidade Grau III (Mórbida)");
    }
}
