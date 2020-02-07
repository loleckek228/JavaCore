package com.geekbrains.homework.lesson2;

public class MainApp {
    public static void main(String[] args) {
        String[][] twoDimArray = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        try {
            System.out.println(sumArray(twoDimArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static int sumArray(String[][] twoDimArray) {
        int sum = 0;
        if (!checkSize(twoDimArray)) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < twoDimArray.length; i++) {
                for (int j = 0; j < twoDimArray.length; j++) {
                    try {
                        sum += Integer.parseInt(twoDimArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(twoDimArray[i][j], i, j);
                    }
                }
            }
        }
        return sum;
    }

    private static boolean checkSize(String[][] twoDimArray) {
        for (String[] aTwoDimArray : twoDimArray) {
            if (aTwoDimArray.length != 4) {
                return false;
            }
        }
        return twoDimArray.length == 4;
    }
}