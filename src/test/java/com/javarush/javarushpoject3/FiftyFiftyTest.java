package com.javarush.javarushpoject3;

import com.javarush.javarushpoject3.logica.FiftyFifty;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiftyFiftyTest {

    @Test
    void delitLeft() {                            // восемь элементов делит по полам = 4
        FiftyFifty fiftyFifty = new FiftyFifty();
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f", "g", "h");
        List<String> left = fiftyFifty.delitLeft(list);
        System.out.println(left);
        assertEquals(4, left.size());
    }

    @Test
    void delitLeft1() {                            // первый элемент первой половины
        FiftyFifty fiftyFifty = new FiftyFifty();
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f", "g", "h");
        List<String> left = fiftyFifty.delitLeft(list);
        assertEquals("a", left.get(0));
    }

    @Test
    void delitRight() {                            // восемь элементов делит по полам = 4
        FiftyFifty fiftyFifty = new FiftyFifty();
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f", "g", "h");
        List<String> left = fiftyFifty.delitLeft(list);
        System.out.println(left);
        assertEquals(4, left.size());
    }

    @Test
    void delitRight1() {                          // первый элемент второй половины
        FiftyFifty fiftyFifty = new FiftyFifty();
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f", "g", "h");
        List<String> left = fiftyFifty.delitRight(list);
        assertEquals("e", left.get(0));
    }
}