package Lesson_5;

public class MyCalc implements Runnable {
    private float arr[];
    private int deltaStep;

    public MyCalc(float[] arr, int half) {
        this.arr = arr;
        this.deltaStep=half;
    }
    public float[] getArr(){
        return this.arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i+deltaStep)/5) * Math.cos(0.2f + (i+deltaStep)/5) * Math.cos(0.4f + (i+deltaStep)/2));
        }
    }

}
