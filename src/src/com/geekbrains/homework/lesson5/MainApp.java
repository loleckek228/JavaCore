package com.geekbrains.homework.lesson5;

public class MainApp {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        System.out.println(firstMethod());
        System.out.println(secondMethod());
    }
    
    public static long firstMethod() {
        float[] arr = new float[SIZE];

        insertOne(arr);

        long start = System.currentTimeMillis();

        insertFormula(arr);

        long stop = System.currentTimeMillis();

        return stop - start;
    }

    public static long secondMethod() {
        float[] arr = new float[SIZE];

        insertOne(arr);

        long start = System.currentTimeMillis();

        float a1[] = new float[HALF];
        float a2[] = new float[HALF];

        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        new Thread(() -> {
            insertFormula(a1);
        }).start();

        new Thread(() -> {
            insertFormula(a2);
        }).start();

        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);

        long stop = System.currentTimeMillis();

        return stop - start;
    }

    public static float formula(float value, int index) {
        return (float) (value * Math.sin(0.2f * index / 5) * Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
    }

    public static void insertOne(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
    }

    public static void insertFormula(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = formula(array[i], i);
        }
    }
}