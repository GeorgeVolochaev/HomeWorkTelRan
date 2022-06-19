public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate p) {
        if (fullness == true) {
            return;}

        if (p.getFood()>=appetite){
            p.decreaseFood(appetite);
            System.out.println(this.name + " is full");
            fullness = true;
        }
        else {
            System.out.println("Not enough food for " +this.name);
        }
    }
}
