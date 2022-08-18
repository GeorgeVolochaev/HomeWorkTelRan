public class ThreadExt extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": " +i);
        }
    }
}


