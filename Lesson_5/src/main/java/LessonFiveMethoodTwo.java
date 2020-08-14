
import java.util.Arrays;

public class LessonFiveMethoodTwo implements Runnable {
    static final int SIZEARRAY = 10000000;
    static final int SIZEARRAYTWO = SIZEARRAY / 2;
    float[] arrayOne = new float[SIZEARRAY];
    float[] arrayTwo = new float[SIZEARRAYTWO];
    float[] arrayTree = new float[SIZEARRAYTWO];

    public void run() {

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = 1;
        }

        long leadTime = System.currentTimeMillis();
        long leadTimeTwo = System.currentTimeMillis();

        try {
            Thread.sleep(1);
            System.arraycopy(arrayOne, 0, arrayTwo, 0, SIZEARRAYTWO);
            System.arraycopy(arrayOne, SIZEARRAYTWO, arrayTree, 0, SIZEARRAYTWO);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayTree));

        System.currentTimeMillis();
        System.out.println("Время на разбивку массива 1 " + (System.currentTimeMillis() - leadTime));
        System.out.println("Время на разбивку массива 2 " + (System.currentTimeMillis() - leadTimeTwo));

        for (int i = 0; i < arrayTwo.length; i++) {
            try {
                Thread.sleep(1);
                arrayTwo[i] = (float)(arrayTwo[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Массив 1 " + (Arrays.toString(arrayTwo)));

        System.currentTimeMillis();

        System.out.println("Время на заполнение массива 1 " + (System.currentTimeMillis() - leadTime));

        for (int i = 0; i < arrayTree.length; i++) {
            try {
                Thread.sleep(1);
                arrayTree[i] = (float)(arrayTree[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Массив 2 " + (Arrays.toString(arrayTree)));

        System.currentTimeMillis();

        System.out.println("Время на заполнение массива 2 " + (System.currentTimeMillis() - leadTimeTwo));

        try {
            Thread.sleep(1);

            System.arraycopy(arrayTwo, 0, arrayOne, 0, SIZEARRAYTWO);
            System.arraycopy(arrayTree, 0, arrayOne, SIZEARRAYTWO, SIZEARRAYTWO);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.currentTimeMillis();
        System.out.println("Время на соединение массива " + (System.currentTimeMillis() - leadTime));
    }
}

