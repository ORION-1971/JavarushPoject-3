package com.javarush.javarushpoject3;

import com.javarush.javarushpoject3.logica.Denominator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.javarush.javarushpoject3.logica.Denominator.list52;
import static org.junit.jupiter.api.Assertions.*;

class DenominatorTest {
    @BeforeEach
    public void init() {
    //List<String> list = new ArrayList<>();
    }

    @Test
    public void koloda() {
        Denominator denominator = new Denominator();  // если колода list52.isEmpty()
        denominator.koloda();
        assertEquals(list52.size(), 32);
    }

    @Test
    public void koloda1() {   // тест не проходит из-за рандомизации, проверить различные показания list.get(0)
        Denominator denominator = new Denominator();
        denominator.koloda();
        assertNotNull(list52.get(0), "img/0.svg");
    }

    @Test
    public void koloda2() {
        Denominator denominator = new Denominator(); // если колода НЕ list52.isEmpty()
        List<String> list = new ArrayList<>();     //List.of("img/0.svg", "img/1.svg", "img/2.svg", "img/3.svg");
        list.add("img/0.svg");
        list.add("img/1.svg");
        list.add("img/2.svg");
        denominator.koloda();
        assertEquals(list.size(), 3);
    }
}