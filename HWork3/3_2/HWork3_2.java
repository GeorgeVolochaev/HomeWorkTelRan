public class HWork3_2 {
    public static void main(String[] args) {

        //A-B-C-E
        var plate = new Plate(100);
        plate.increaseFood(10);
        var Leo = new Cat("Leo", 50);
        plate.info(); Leo.eat(plate);plate.info();
        Leo.eat(plate);plate.info();
        System.out.println("---------------------------");
        //A-B-C-E

        //D
        var plateForCats = new Plate(110);
        Cat[] objCats = new Cat[3];
        objCats[0] = new Cat("Kitty", 30);
        objCats[1] = new Cat("Oliver", 50);
        objCats[2] = new Cat("Loki", 40);

        for (int i = 0; i < objCats.length; i++) {
            objCats[i].eat(plateForCats);
            //System.out.println(objCats[i].isFullness());
            plateForCats.info();
        }
        //D



    }
}