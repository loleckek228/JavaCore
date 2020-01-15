package com.geekbrains.homework.lesson2;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Двумерный массив должен быть размером 4x4");
    }
}