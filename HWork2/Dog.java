package pkHomeWork02;

public class Dog extends Animal{
    public static int countDogs;

    static {countDogs = 0;};

    public Dog(int maxRun, int maxSwim, String ObjName) {
         super(maxRun, maxSwim, ObjName);
         countDogs ++;
    }
}
