package pkHomeWork02;

public class Cat extends Animal{
    public static int countCats;

    static {countCats = 0;};

    public Cat(int maxRun, int maxSwim, String ObjName) {
        super(maxRun, maxSwim, ObjName);
        countCats ++;
    }
}
