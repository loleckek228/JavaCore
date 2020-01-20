package com.geekbrains.homework.lesson3.task2;

import java.util.*;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            for (Map.Entry<String, ArrayList<String>> human : phoneBook.entrySet()) {
                if (lastName.contains(human.getKey())) {
                    human.getValue().add(phoneNumber);
                }
            }
        } else {
            phoneBook.put(lastName, new ArrayList<>(Collections.singletonList(phoneNumber)));
        }
    }

    public void get(String lastName) {
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонный справочник пустой");
        }
        else if (!phoneBook.containsKey(lastName)) {
            System.out.println("Телефонный справочник не хранит в себе данные об " + "\"" + lastName + "\"");
        }
        else {
            for (String number : phoneBook.get(lastName)) {
                System.out.println(lastName + " - " + number);
            }
        }
    }
}