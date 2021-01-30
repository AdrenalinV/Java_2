package Lesson_5;

public class Lesson_5 {
    public static void main(String[] args) {
        final int SIZE = 10000000;
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        lineCalculate(arr);
        System.out.println("time one thread: " + (System.currentTimeMillis() - a));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        a = System.currentTimeMillis();
        multiCalculate(arr, 5);
        System.out.println("time five thread: " + (System.currentTimeMillis() - a));

    }

    public static void lineCalculate(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void multiCalculate(float[] arr, int path) {
        int half = arr.length / path;
        Thread[] t = new Thread[path];
        float[][] a = new float[path][half];
        for (int i = 0; i < path; i++) {
            System.arraycopy(arr,  (half * i), a[i], 0, half);
            t[i] = new Thread(new MyCalc(a[i], (half * i)));
            t[i].start();
        }
        boolean alive = true;
        while (alive) {
            boolean live = false;
            for (Thread tr : t) {
                live |= tr.isAlive();
            }
            alive = live;
        }
        for (int i = 0; i < path; i++) {
            System.arraycopy(a[i], 0, arr, (half * i), half);

        }
    }


}
