import java.util.Arrays;

public class LessonFiveMethoodOne implements Runnable {

    static final int SIZEARRAY = 10000000;
    float[] arrayOne = new float[SIZEARRAY];

    public void run() {

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = 1;
        }
        System.out.println(Arrays.toString(arrayOne));

        long leadTime = System.currentTimeMillis();

        for (int i = 0; i < arrayOne.length; i++) {
            try {
                Thread.sleep(1);
                arrayOne[i] = (float)(arrayOne[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Arrays.toString(arrayOne));

        System.currentTimeMillis();

        System.out.println(System.currentTimeMillis() - leadTime);

    }
}
