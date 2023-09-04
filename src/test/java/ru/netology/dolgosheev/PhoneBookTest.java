package ru.netology.dolgosheev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void TestAddFirstContact() {
        PhoneBook phoneBook = new PhoneBook();
        assertTrue(phoneBook.add("Aleksandr", 5555555) == 1,
                "Неверное число контактов");
    }

    @Test
    public void TestAddSecondContact() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Aleksandr", 5555555);
        assertTrue(phoneBook.add("Stepan", 2222222) == 2,
                "Неверное число контактов");
    }

    @Test
    public void TestAddSameContact() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Aleksandr", 5555555);
        assertTrue(phoneBook.add("Aleksandr", 5555555) == 1,
                "Неверное число контактов");
    }

    @Test
    public void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Aleksandr", 5555555);
        phoneBook.add("Stepan", 2222222);
        assertTrue(phoneBook.findByNumber(2222222).equals("Stepan"), "Неправильное имя");
    }
}