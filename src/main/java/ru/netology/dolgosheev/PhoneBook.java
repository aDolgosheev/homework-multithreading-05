package ru.netology.dolgosheev;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, Integer> phoneBook = new HashMap<>();

    public int add(String name, int number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        }
        return phoneBook.size();
    }
}
