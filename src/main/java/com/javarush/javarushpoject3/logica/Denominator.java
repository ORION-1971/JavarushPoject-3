package com.javarush.javarushpoject3.logica;

import java.util.*;

public class Denominator {
    public static List<String> list52 = new ArrayList<>();  // список 52 карты
    public static List<String> arr00000 = new ArrayList<>();
    public static List<String> arr00001 = new ArrayList<>();
    public static String messages = "";
    public static String respon1 = "";
    public static String respon2 = "";
    public static String SOLID = "";


    public void koloda() {
        if (list52.isEmpty()) {
            for (int i = 0; i < 32; i++) {                   // создание колоды
                list52.add("img/" + i + ".svg");
            }
            Collections.shuffle(list52);
            FiftyFifty fiftyFifty = new FiftyFifty();
            arr00000 = fiftyFifty.delitLeft(list52);
            arr00001 = fiftyFifty.delitRight(list52);
        }
        Shuffle52 shuffle52 = new Shuffle52();                  // тусовка колоды
        shuffle52.shuffler();
    }
}
