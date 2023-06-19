package com.example.jsptraining;

public class MyModel {
    private int[] array;

    public int[] getMyVariable() {
        return array;
    }
    public void setArray(int[] array) {
        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100.0);
        }
        this.array = array;
    }
}