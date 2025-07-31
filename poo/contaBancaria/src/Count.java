import java.util.Random;

public class Count {
    private final String name;
    private int countId;
    private double cash;
    private double overdraft;
    private double totalCash;

    public double getCash() {
        return cash;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public double getOverdraft() {
        return overdraft;
    }
    public double checkOverdraft(){
        if (this.overdraft == 0) {
            double cash = 0.0;
            System.out.println("Um valor de 20% foi debitado automaticamente da sua conta. Você não possui mais cheque spec.");
            cash = this.overdraft * 0.2;
            this.totalCash -= cash;

        }
        return overdraft;
    }

    public String getName() {
        return name;
    }

    public Count(String name, double cash) {
        this.name = name;
        this.cash = cash;
        if (this.cash <= 500) this.overdraft = 50.0;
        if (this.cash > 500) this.overdraft = this.cash * 0.5;
        Random random = new Random();
        this.countId = (int) (Math.random() * 10000);
        this.totalCash = cash + overdraft;
    }

    public void insertCash (double deposit) {
        this.cash += deposit;
        this.totalCash += deposit;
        System.out.printf("O valor de %s foi depositado na sua conta. Agora possui %s \n", deposit, this.totalCash);
    }
    public void cashOutMoney (double cash) {
        this.cash = this.cash - cash;
        this.totalCash = this.totalCash - cash;
        System.out.printf("O valor de %s foi sacado da sua conta. Agora possui %s \n", cash, this.totalCash);
    }

    public void cashOutOverdraft (double overdraftParam) {
        this.overdraft = this.overdraft - overdraftParam;
        this.totalCash = this.totalCash - overdraftParam;
        System.out.printf("O valor de %s foi sacado da sua conta. Agora possui %s \n", overdraftParam, this.totalCash);
    }

    public void paymentWithCash (double cash) {
        this.cash = this.cash - cash;
        this.totalCash = this.totalCash - cash;
        System.out.printf("O valor de %s foi retirado da sua conta. Agora possui %s \n", cash, this.totalCash);
    }
    public void paymentWithOverdraft (double cash) {
        this.overdraft = this.overdraft - cash;
        this.totalCash = this.totalCash - cash;
        System.out.printf("O valor de %s foi retirado da sua conta. Agora possui %s \n", cash, this.totalCash);
    }
    public boolean hasOverdraft (double value) {
        if (this.overdraft == 0) {
            System.out.println("Um valor de 20% foi debitado automaticamente da sua conta. Você não possui mais cheque spec.");
            double cash = this.overdraft * 0.2;
            this.cash = this.cash - cash;
            this.totalCash = this.cash;
            return false;
        }
        if (this.overdraft >= value) {
            System.out.printf("Seu valor de cheque especial: %s \n", this.overdraft);
            return true;
        }
        else {
            System.out.printf("Não é possível efetuar operação com este valor de cheque espec. : %s \n", this.overdraft);
            return false;
        }
    }
}

