package pkHomeWork02;

public abstract class Animal implements IfAnimal{
     protected static int countAnimals;
     protected  String className;
     protected int maxRun;
     protected int maxSwim;
     protected String ObjName;

     static {
         countAnimals = 0;};

     public Animal(int maxRun, int maxSwim, String ObjName) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.ObjName = ObjName;
        className = getClass().getSimpleName();
        countAnimals++;
    }

    public static int GetAnimalCount(){return countAnimals;}

    private String move(int max, int length, String nameMovementPresentTense, String nameMovementPastTense){
        if (max == 0) {return className + " can not " + nameMovementPresentTense;}
        if (length>max){return "Distance exceeds the maximum value";}
        return ObjName + " successfully " + nameMovementPastTense + " " + length + " m.";}

    public String run(int distance){return move(maxRun, distance, "run", "ran");}
    public String swim(int distance){return move(maxSwim, distance, "swim", "swam");}



}
