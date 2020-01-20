package com.geekbrains.homework.lesson2;

public class MyArrayDataException extends RuntimeException {
    int row;
    int column;

    public MyArrayDataException(String str, int row, int column) {
        super(String.format("В ячейке [%d][%d] двумерного массива неверные данные: '%s'", row, column, str));
        this.row = row;
        this.column = column;
    }
}