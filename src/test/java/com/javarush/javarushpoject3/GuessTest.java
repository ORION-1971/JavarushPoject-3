package com.javarush.javarushpoject3;

import com.javarush.javarushpoject3.logica.Guess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import static com.javarush.javarushpoject3.logica.Denominator.*;

class GuessTest {
    @BeforeEach
    public void init() {
        Collections.addAll(list52, "a", "b", "c", "d", "e", "f", "g", "h");
        Collections.addAll(arr00000, "1", "2", "3", "4");
        Collections.addAll(arr00001, "5", "6", "7", "8");
    }

    @Test               // собирает обе коллекции в кучу
    void arr00000() {
        Guess guess = new Guess();
        assertEquals(8,list52.size());
        guess.arr00000();
        assertEquals(12,list52.size());
    }

    @Test               // порядок элементов в куче
    void arr00000a() {
        Guess guess = new Guess();
        guess.arr00000();
        assertEquals("[2, 1, h, g, f, e, d, c, b, a, 3, 4]", list52.toString());
    }


    @Test               // собирает обе коллекции в кучу2
    void arr00001() {
        Guess guess = new Guess();
        assertEquals(8,list52.size());
        guess.arr00001();
        assertEquals(12,list52.size());
    }

    @Test               // порядок элементов в куче2
    void arr00001a() {
        Guess guess = new Guess();
        guess.arr00001();
        assertEquals("[6, 5, h, g, f, e, d, c, b, a, 7, 8]", list52.toString());
    }

    @Test               // Зеркалит коллекцию
    void arr0000() {
        Guess guess = new Guess();
        assertEquals(8,list52.size());
        guess.arr0000();
        assertEquals(8,list52.size());
    }

    @Test               // порядок элементов в коллекции
    void arr0000a() {
        Guess guess = new Guess();
        guess.arr0000();
        assertEquals("[h, g, f, e, d, c, b, a]", list52.toString());
    }


    @Test               // Зеркалит коллекцию
    void arr0001() {
        Guess guess = new Guess();
        assertEquals(8,list52.size());
        guess.arr0001();
        assertEquals(8,list52.size());
    }

    @Test               // порядок элементов в коллекции
    void arr0001a() {
        Guess guess = new Guess();
        guess.arr0001();
        assertEquals("[h, g, f, e, d, c, b, a]", list52.toString());
    }

    @Test               // Зеркалит коллекцию
    void arr000() {
        Guess guess = new Guess();
        assertEquals(8,list52.size());
        guess.arr000();
        assertEquals(8,list52.size());
    }

    @Test               // порядок элементов в коллекции
    void arr000a() {
        Guess guess = new Guess();
        assertEquals("[a, b, c, d, e, f, g, h]", list52.toString());
        guess.arr000();
        assertEquals("[h, g, f, e, d, c, b, a]", list52.toString());
    }


    @Test               // Зеркалит коллекцию
    void arr001() {
        Guess guess = new Guess();
        assertEquals(8,list52.size());
        guess.arr001();
        assertEquals(8,list52.size());
    }

    @Test               // порядок элементов в коллекции
    void arr001a() {
        Guess guess = new Guess();
        assertEquals("[a, b, c, d, e, f, g, h]", list52.toString());
        guess.arr001();
        assertEquals("[h, g, f, e, d, c, b, a]", list52.toString());
    }
}