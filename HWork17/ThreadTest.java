public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("START");
        System.out.println(Thread.currentThread().getName());
        var thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });  //new ThreadExt(); //new Thread(new RunnableImpl());

        var thread2 = new ThreadExt(); //new Thread(new RunnableImpl());

        thread.start();
        thread.join(100);

        thread2.start();

        System.out.println("END");

    }
}