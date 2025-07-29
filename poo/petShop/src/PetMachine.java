public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;


    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho! \uD83E\uDDFC");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo.");
    }

    public void addShampoo(){
        if(shampoo == 10) {
            System.out.println("Capacidade máxima de shampoo suportada.");
        }
        shampoo += 2;
    }

    public void addWater(){
        if(water == 30) {
            System.out.println("Capacidade máxima de água suportada.");
        }
        water += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja. Limpe a máquina para colocar o pet.");
            return;
        }
        if (hasPet()){
            System.out.println("Já tem um pet " + this.pet.getName() + " na máquina neste momento");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina!");
    }

    public void removePet() {
        if(this.pet.isClean()){
            this.clean = !this.pet.isClean();
        }
        System.out.println("O pet " + pet.getName() + " foi tirado da máquina");
        this.pet = null;

    }
    public void washMachine(){
        if(this.clean){
            System.out.println("Não é necessário limpar a máquina, ela está limpa.");
        }
        if(this.water >= 10 && this.shampoo >= 2 && !this.clean) {
            this.water -= 10;
            this.shampoo -= 2;
            this.clean = true;
            System.out.println("A máquina foi limpa");
        }
        if ((this.water < 10 || this.shampoo < 2) && !this.clean) {
            System.out.println("Coloque mais shampoo ou água para realizar a limpeza");
            System.out.printf("Necessário de água: 10 - Na máquina: %s \n",this.water);
            System.out.printf("Necessário de shampoo: 2 - Na máquina: %s \n", this.shampoo);
        }

    }
}
