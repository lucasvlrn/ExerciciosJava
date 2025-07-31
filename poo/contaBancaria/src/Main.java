import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Olá, crie sua conta abaixo:");
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Qual o valor do primeiro depósito? ");
        double money = scanner.nextDouble();

        Count count = new Count(name, money);
        var option = -1;
        do {
            System.out.println("--- O que deseja fazer? ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar cheque especial");
            System.out.println("7 - Sair");
            option = scanner.nextInt();

            switch(option){
                case 1 -> System.out.println(count.getTotalCash());
                case 2 -> System.out.println(count.getOverdraft());
                case 3 -> insertCash(count);
                case 4 -> cashOut(count);
                case 5 -> payment(count);
                case 6 -> System.out.println(count.checkOverdraft());
                case 7 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }
        }while(true);
    }

    public static void insertCash (Count count) {
        System.out.println("Qual o valor do depósito?");
        double value = scanner.nextDouble();
        count.insertCash(value);
    }

    public static void cashOut (Count count) {
        System.out.println("Qual o valor do saque?");
        double value = scanner.nextDouble();
        while(true){
            System.out.println("Sacar dinheiro (opção 1) ou do cheque espec. (opção 2)? (1/2) - 0 para Sair");
            var opt = scanner.nextInt();

            if(opt == 1) {
                count.cashOutMoney(value);
                return;
            }
            else if(opt == 2 && count.hasOverdraft(value)){
                count.cashOutOverdraft(value);
                return;
            }

            else if(opt != 1 && opt != 2 && opt != 0) System.out.println("Opção inválida.");
            else {
                return;
            }
        }

    }
    public static void payment (Count count) {
        System.out.println("Qual o valor do pagamento?");
        double value = scanner.nextDouble();
        while(true){
            System.out.println("Pagar em dinheiro (opção 1) ou em cheque espec. (opção 2)? (1/2) - 0 para Sair");
            var opt = scanner.nextInt();

            if(opt == 1) {
                count.paymentWithCash(value);
                return;
            }
            else if(opt == 2 && count.hasOverdraft(value)) {
                count.paymentWithOverdraft(value);
                return;
            }
            else if(opt != 1 && opt != 2 && opt != 0) System.out.println("Opção inválida.");
            else {
                return;
            }
        }

    }
}
