
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class MainClass {
    public static final int CARS_COUNT = 4;
    public static final CyclicBarrier cyclicBarrier = new CyclicBarrier(CARS_COUNT);
    public static final Semaphore smp = new Semaphore(CARS_COUNT/2);
    public static String winner = "";
    public static boolean justOne = false;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }

        Thread[] th = new Thread[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            th[i] = new Thread(cars[i]);
            th[i].start();
        }
        for (int i = 0; i < cars.length; i++) {
            th[i].join();
        }

        System.out.println(winner + " WIN");
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}