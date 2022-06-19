package pkHomeWork02;

/**
 * Java homework 2
 * @author George Volochaev
 * @version 2   19.06.2022
 *
 */

public class HWork2 {
    public static void main(String[] args) {

        var dogMax = new Dog(500, 10, "dogMax");
        var dogBuddy = new Dog(500, 10, "dogBuddy");
        var catLeo = new Cat(300, 0, "catLeo");

        System.out.println(dogMax.run(200));
        System.out.println(dogBuddy.run(700));
        System.out.println(dogBuddy.swim(7));
        System.out.println("Dogs = " + Dog.countDogs);
        System.out.println("------------------------------------------------");

        System.out.println(catLeo.run(100));
        System.out.println(catLeo.swim(100));
        System.out.println("Cats = " + Cat.countCats);

        System.out.println("------------------------------------------------");
        System.out.println("Animals = " + Animal.GetAnimalCount());

    }
}