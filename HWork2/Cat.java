package PkHomeWork02;

public class Cat extends Animal{
    public static int countCats = 0;
    final int maxRun = 200;
    final int maxSwim = 0;
    final String nameClass = "Cat";

    void run(int lengthRun){
        System.out.println(nameClass + " have run " + Math.min(maxRun,lengthRun) + " m.");};
    void swim(int lengthSwim){
        System.out.println(nameClass + " have swum " + Math.min(maxSwim,lengthSwim)+ " m.");};

    public Cat() {
        countCats ++;
    }

    @Override
    public String toString(){
        return "You have created " + countCats+ " Cats";
    }

}
