package com.javarush.javarushpoject3.logica;

import java.util.ArrayList;
import java.util.List;

import static com.javarush.javarushpoject3.logica.Denominator.*;

public class Guess {

    List<String> arr0000 = new ArrayList<>();
    List<String> arr0001 = new ArrayList<>();

    List<String> arr000 = new ArrayList<>();
    List<String> arr001 = new ArrayList<>();

    List<String> arr00 = new ArrayList<>();
    List<String> arr01 = new ArrayList<>();

    List<String> arr0 = new ArrayList<>();
    List<String> arr1 = new ArrayList<>();


//+++++++++++++++++++++++++ 16 - 16 +++++++++++++++++++++++++++++++++++++++

   public void arr00000() { // ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();

        arr0000 = fiftyFifty.delitLeft(arr00000);
        arr0001 = fiftyFifty.delitRight(arr00000);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr0000, arr0001);   // заброс выбранных коллекций в общую
    }

    public void arr00001() { // ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr0000 = fiftyFifty.delitLeft(arr00001);
        arr0001 = fiftyFifty.delitRight(arr00001);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr0000, arr0001);   // заброс выбранных коллекций в общую
    }

    //+++++++++++++++++++++++++ 8 - 8 +++++++++++++++++++++++++++++++++++++++

    public void arr0000() {// ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr000 = fiftyFifty.delitLeft(arr0000);
        arr001 = fiftyFifty.delitRight(arr0000);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr000, arr001);   // заброс выбранных коллекций в общую
    }

    public void arr0001() { // ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr000 = fiftyFifty.delitLeft(arr0001);
        arr001 = fiftyFifty.delitRight(arr0001);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr000, arr001);   // заброс выбранных коллекций в общую
    }

    //+++++++++++++++++++++++++ 4 - 4 +++++++++++++++++++++++++++++++++++++++

    public void arr000() {// ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr00 = fiftyFifty.delitLeft(arr000);
        arr01 = fiftyFifty.delitRight(arr000);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr00, arr01);   // заброс выбранных коллекций в общую
    }

    public void arr001() { // ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr00 = fiftyFifty.delitLeft(arr001);
        arr01 = fiftyFifty.delitRight(arr001);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr00, arr01);   // заброс выбранных коллекций в общую
    }

    //+++++++++++++++++++++++++ 2 - 2 +++++++++++++++++++++++++++++++++++++++

    public void arr00() {
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr0 = fiftyFifty.delitLeft(arr00);
        arr1 = fiftyFifty.delitRight(arr00);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr0, arr1);   // заброс выбранных коллекций в общую
    }

    public void arr01() {
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr0 = fiftyFifty.delitLeft(arr01);
        arr1 = fiftyFifty.delitRight(arr01);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr0, arr1);   // заброс выбранных коллекций в общую
    }

    //+++++++++++++++++++++++++ 1 - 1 +++++++++++++++++++++++++++++++++++++++

    public void arr0() {
        SOLID = arr0.get(0);
        System.out.println("SOLID = " + SOLID);
    }

    public void arr1() {
        SOLID = arr1.get(0);
        System.out.println("SOLID = " + SOLID);
    }
}
