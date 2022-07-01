public class HWork6 {
    public static void main(String[] args) {

        SimpleBox<Integer> box1 = new SimpleBox<>(5);
        SimpleBox<Integer> box2 = new SimpleBox<>(6);
        System.out.println(box1.getObj() + box2.getObj());
        System.out.println(box1.getType());

        SimpleBox<Float> box3 = new SimpleBox<>(3.5f);
        SimpleBox<Float> box4 = new SimpleBox<>(4.8f);
        System.out.println(box3.getObj() + box4.getObj());
        System.out.println(box3.getType());

    }
}