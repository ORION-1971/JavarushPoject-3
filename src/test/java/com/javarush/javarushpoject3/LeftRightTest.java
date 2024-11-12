package com.javarush.javarushpoject3;

import com.javarush.javarushpoject3.logica.LeftRight;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.javarush.javarushpoject3.logica.Denominator.list52;
import static org.junit.jupiter.api.Assertions.*;

class LeftRightTest {

    @Test
    void lbodyR() {                     // Объединение коллекций в порядке заданной ЛОГИКОЙ
        LeftRight leftRight = new LeftRight();
        List<String> listL = new ArrayList<>();
        List<String> listR = new ArrayList<>();
        Collections.addAll(list52, "1", "2", "3");
        Collections.addAll(listL, "a", "b", "c");
        Collections.addAll(listR, "d", "e", "f");

        assertEquals("[1, 2, 3]", list52.toString());
        leftRight.LbodyR(listL, listR);
        assertEquals("[c, b, a, 3, 2, 1, d, e, f]", list52.toString());

    }
}