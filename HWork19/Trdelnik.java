/**
 * Java homework19
 * @author
 * @version 1   24.08.2022
 *
 */

public class Trdelnik {
    private int countTrd = 0;
    private Object mon = new Object();

    public static void main(String[] args) throws InterruptedException {
         var trd = new Trdelnik();
         var cook = new Thread(trd::cookTrd);
         var buy = new Thread(trd::buyTrd);

         cook.start(); buy.start();
         cook.join();buy.join();
         System.out.println(trd.countTrd);

    }

    private void cookTrd() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(300);
                synchronized (mon) {
                    if (countTrd == 1) {
                        mon.wait();
                    }
                    System.out.println("Trdelnik is cooked.");
                    countTrd++;
                    mon.notify();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private void buyTrd() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                synchronized (mon) {
                    if (countTrd == 0) {
                        mon.wait();
                    }
                    if (countTrd == 1) {
                        countTrd--;
                        System.out.println("Client is happy.");
                    } else if (countTrd>1) {
                        countTrd--;
                        System.out.println("Client is not so happy.");
                    }else {
                        System.out.println("Client is very unhappy.");
                    }

                    mon.notify();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
