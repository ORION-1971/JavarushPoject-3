package com.javarush.javarushpoject3.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.javarush.javarushpoject3.logica.Denominator.list52;


public class LeftRight {
    // метод разделения параметров по разные стороны коллекции:  ЛЕВАЯ - ТЕЛО - ПРАВАЯ
    public static void LbodyR(List<String> listL, List<String> listR ) {
        // Удаление дубликатов выбранных параметров ЛЕВОЙ части с основной коллекции
        ArrayList<String> listCopy = new ArrayList<>(list52);
        for (String i : listCopy) {
            for (String j : listL) {
                if (i.equals(j)) {
                    list52.remove(i);
                }
            }
        }
        // Удаление дубликатов выбранных параметров ПРАВОЙ части с основной коллекции
        ArrayList<String> listCopy1 = new ArrayList<>(list52);
        for (String i : listCopy1) {
            for (String j : listR) {
                if (i.equals(j)) {
                    list52.remove(i);
                }
            }
        }
        // Добавление В ХВОСТ основной коллекци, ЛЕВУЮ часть выбранных параметров
        for (String i : listL) { list52.add(i);}
        // ХВОСТ НА ГОЛОВУ
        Collections.reverse(list52);
        // Добавление В ХВОСТ основной коллекци, ПРАВУЮ часть выбранных параметров
        for (String i : listR) { list52.add(i);}
    }


}
