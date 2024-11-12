package com.javarush.javarushpoject3.logica;

import java.util.ArrayList;
import java.util.List;

public class FiftyFifty {
    List<String> left = new ArrayList<>();
    List<String> right = new ArrayList<>();
        // деление колоды пополам
    public List<String> delitLeft(List<String> list) {
        for (int i = 0; i < list.size()/2; i++) {
            left.add(i,list.get(i));
        }
        return left;
    }

    public List<String> delitRight(List<String> list) {
        for (int i = 0; i < list.size()/2; i++) {
            right.add(i,list.get(i + list.size()/2));
        }
        return right;
    }
}
