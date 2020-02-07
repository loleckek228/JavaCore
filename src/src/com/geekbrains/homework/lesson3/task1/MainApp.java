package com.geekbrains.homework.lesson3.task1;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        String[] words = { "слово", "храм", "любовь", "травмы", "марвел", "жизнь", "хотеть", "верить", "чужие", "жить",
                "сказать", "слово", "храм", "надо", "травмы" };

        Set<String> wordsSet = new HashSet<>();

        wordsSet.addAll(Arrays.asList(words));

        for (String word : wordsSet) {
            System.out.println(word + ": " + Collections.frequency(Arrays.asList(words), word));
        }
    }
}