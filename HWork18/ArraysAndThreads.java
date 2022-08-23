import java.util.Arrays;

/**
 * Java homework18
 * @author George Volochaev
 * @version 1   23.08.2022
 *
 */

public class ArraysAndThreads {
    private static final int SIZE = 10_000_000;
    private static final int HALF = SIZE/2;
    public  static float[] arr = new float[SIZE];
    public  static float[] arr1 = new float[HALF];
    public  static float[] arr2 = new float[HALF];
    private interface TrigonometryFunction{
        float calculate(int i, float ValueArrI);
    }

    static {
        InitArray();
    }

    private static final TrigonometryFunction calculateFunction =
            (int k, float ValueArrI) -> (float)(
                    ValueArrI*Math.sin(0.2f + (float)(k / 5)*
                            Math.cos(0.2f + (float)(k / 5))*
                            Math.cos(0.4f + (float)(k / 2))));

    private static void InitArray(){
        Arrays.fill(arr, 1.0f);
    }

    private static void FillArray(float[] array, int size, int j){
        for (int i = 0; i < size; i++) {
            int k = i + j;
            array[i] = calculateFunction.calculate(k,array[i]);
        }
    }

    public static long CalcTimeFirstMethod(int size){
        long a = System.currentTimeMillis();
        FillArray(arr,size,0);
        return System.currentTimeMillis() - a;
    }

    private static Thread CreateHalfThread(float[] HalfArray,int j){
        return new Thread(() -> {FillArray(HalfArray, HALF, j);});
    }
    public static long CalcTimeSecondMethod() throws InterruptedException {
        long a = System.currentTimeMillis();

        System.arraycopy(arr,0,arr1,0,HALF);
        System.arraycopy(arr,0,arr2,0,HALF);

        var thread1 = CreateHalfThread(arr1,0);
        var thread2 = CreateHalfThread(arr2, HALF);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        return System.currentTimeMillis() - a;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("FirstMethod: " +ArraysAndThreads.CalcTimeFirstMethod(SIZE)+ " ms.");
        //for (float el: ArraysAndThreads.arr) {System.out.println(el);}
        System.out.println("----");

        InitArray();
        System.out.println("SecondMethod: " +ArraysAndThreads.CalcTimeSecondMethod()+ " ms.");

    }
}
