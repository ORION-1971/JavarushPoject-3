package com.javarush.javarushpoject3.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.javarush.javarushpoject3.logica.Denominator.list52;

public class Shuffle52 {

    List<String> listLeft = new ArrayList<>();  // список Левой половины карт
    List<String> listRight = new ArrayList<>();  // список Правой половины карт

    public void shuffler() {
        polovinaLeft(listLeft);
        polovinaRight(listRight);

        Collections.shuffle(listLeft);                    // тусовка колоды
        Collections.shuffle(listRight);

        list52.clear();
        for (String str : listLeft) list52.add(str);
        for (String str : listRight) list52.add(str);
    }

    public List<String> polovinaLeft(List<String> list) {
        for (int j = 0; j < 16; j++) {
            list.add(j,list52.get(j));
        }
        return list;
    }

    public List<String> polovinaRight(List<String> list) {
        for (int j = 0; j < 16; j++) {
            list.add(j,list52.get(j+16));
        }
        return list;
    }
}
