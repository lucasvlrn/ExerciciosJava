import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        var numberOne = scanner.nextInt();
        System.out.print("Digite um número maior que o primeiro: ");
        var numberTwo = scanner.nextInt();
        if (numberTwo > numberOne){
            System.out.println("Escolha entre Par (p) ou Ímpar (i)");
            var option = scanner.next();
            var optionSanitized = option.toLowerCase();
            switch (optionSanitized){
                case "p", "par":
                    System.out.printf("Números entre os que você digitou, na opção escolhida: * %s * \n", optionSanitized);
                    if (numberTwo % 2 != 0) System.out.println(numberTwo);
                    for (int i = numberTwo; i >= numberOne; i--){
                        if (i % 2 == 0) System.out.println(i);
                    }
                    if (numberOne % 2 != 0) System.out.println(numberOne);
                    break;
                case "i", "ímpar", "impar":
                    System.out.printf("Números entre os que você digitou, na opção escolhida: * %s * \n", optionSanitized);
                    if (numberTwo % 2 != 1) System.out.println(numberTwo);
                    for (int i = numberTwo; i >= numberOne; i--){
                        if (i % 2 == 1) System.out.println(i);
                    }
                    if (numberOne % 2 != 1) System.out.println(numberOne);
                    break;
                default:
                    System.out.println("Valor inválido");
            }
        } else {
            System.out.println("O segundo número deve ser maior que o primeiro.");
        }
    }
}
