package PkHomeWork02;
/**
 * @author George Volochaev
 * @version 1
 *
 */

public class HWork2 {

    public static void main(String[] args) {

        //Animal for test
        //var Animal1 = new Animal();
        //var Animal2 = new Animal();
        //Animal1.run(2); Animal1.swim(100);
        //Animal2.run(12); Animal2.swim(500);
        //System.out.println(Animal1.getCountAnimals());
        //Animal for test

        int countAnimals = 0;
        //Cat
        var Cat1 = new Cat();
        Cat1.run(200); Cat1.swim(10);
        countAnimals =+ Cat1.getCountAnimals();
        System.out.println(Cat1);
        System.out.println("----------------------------------------");
        //Cat

        //Dog
        var Dog1 = new Dog(); var Dog2 = new Dog();
        Dog1.run(200); Dog1.swim(10);
        Dog2.run(600); Dog2.swim(50);
        System.out.println(Dog1);
        System.out.println("----------------------------------------");
        countAnimals =+ Dog1.getCountAnimals();
        //Cat

        System.out.println("You have created " + countAnimals+ " Animals");

    }
}