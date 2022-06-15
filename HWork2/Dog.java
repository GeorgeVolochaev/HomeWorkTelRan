package PkHomeWork02;

public class Dog extends Animal{
    public static int countDogs = 0;
    final int maxRun = 500;
    final int maxSwim = 10;
    final String nameClass = "Dog";

    void run(int lengthRun){
        System.out.println(nameClass + " have run " + Math.min(maxRun,lengthRun) + " m.");};
    void swim(int lengthSwim){
        System.out.println(nameClass + " have swum " + Math.min(maxSwim,lengthSwim)+ " m.");};

    public Dog() {
        countDogs ++;
    }

    @Override
    public String toString(){
        return "You have created " + countDogs+ " Dogs";
    }

}
