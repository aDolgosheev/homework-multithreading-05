package ru.netology.dolgosheev;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private Map<String, Integer> phoneBook = new HashMap<>();

    public int add(String name, int number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        }
        return phoneBook.size();
    }

    public String findByNumber(int number) {
        Optional<String> result = phoneBook.entrySet()
                .stream()
                .filter(entry -> number == entry.getValue())
                .map(Map.Entry::getKey)
                .findFirst();

        return result.orElse(null);
    }
}
