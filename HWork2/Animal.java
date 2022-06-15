package PkHomeWork02;

public class Animal {
    public static int countAnimals = 0;
    final int maxRun = 500;
    final int maxSwim = 20;
    final String nameClass = "Animal";

    public static int getCountObjects() {return countAnimals;}

    public Animal() {
        countAnimals ++;
    }

    int getCountAnimals()
    {return countAnimals;}

    void run(int lengthRun){
        System.out.println(nameClass + " have run " + Math.min(maxRun,lengthRun) + " m.");};
    void swim(int lengthSwim){
        System.out.println(nameClass + " have swum " + Math.min(maxSwim,lengthSwim)+ " m.");};

    @Override
    public String toString(){
        return "You have created " + countAnimals+ " Animals";
    }


}
