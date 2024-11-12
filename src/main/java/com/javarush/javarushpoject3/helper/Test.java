package com.javarush.javarushpoject3.helper;

import com.javarush.javarushpoject3.logica.FiftyFifty;
import com.javarush.javarushpoject3.logica.LeftRight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static com.javarush.javarushpoject3.logica.Denominator.list52;

public class Test {

    List<String> arr00000 = new ArrayList<>();
    List<String> arr00001 = new ArrayList<>();

    List<String> arr0000 = new ArrayList<>();
    List<String> arr0001 = new ArrayList<>();

    List<String> arr000 = new ArrayList<>();
    List<String> arr001 = new ArrayList<>();

    List<String> arr00 = new ArrayList<>();
    List<String> arr01 = new ArrayList<>();

    List<String> arr0 = new ArrayList<>();
    List<String> arr1 = new ArrayList<>();


    static int sc00000, sc0000, sc000, sc00, sc0;

    public static void main(String[] args) {
        Test test = new Test();

        Collections.addAll(list52, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32");
        FiftyFifty fiftyFifty = new FiftyFifty();
        test.arr00000 = fiftyFifty.delitLeft(list52);
        test.arr00001 = fiftyFifty.delitRight(list52);

//-------------------ВЫЗОВЫ--------------------------
        System.out.println(list52);


        System.out.println("слева - 1 : справа - 2");
        Scanner a = new Scanner(System.in);
        sc00000 = a.nextInt();
        if (sc00000 == 1) test.arr00000();
        if (sc00000 == 2) test.arr00001();

        System.out.println(list52 +" = " + sc00000);

        sc0000 = a.nextInt();
        if (sc0000 == 1) test.arr0000();
        if (sc0000 == 2) test.arr0001();

        System.out.println(list52 +" = " + sc0000);

        sc000 = a.nextInt();
        if (sc000 == 1) test.arr000();
        if (sc000 == 2) test.arr001();

        System.out.println(list52 +" = " + sc000);

        sc00 = a.nextInt();
        if (sc00 == 1) test.arr00();
        if (sc00 == 2) test.arr01();

        System.out.println(list52 +" = " + sc00);

        //+++++++++++++++++++++++++ 1 - 1 +++++++++++++++
        String SOLID = "";
        sc0 = a.nextInt();
        if (sc0 == 1) SOLID = test.arr0.get(0);
        if (sc0 == 2) SOLID = test.arr1.get(0);

        System.out.println("SOLID = " + SOLID);  // Найденное число
    }

    //+++++++++++++++++++++++++ 16 - 16 +++++++++++++++++++++++++++++++++++++++

    void arr00000() {// ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr0000 = fiftyFifty.delitLeft(arr00000);
        arr0001 = fiftyFifty.delitRight(arr00000);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr0000, arr0001);   // заброс выбранных коллекций в общую
        System.out.println(arr0000);
    }

    void arr00001() { // ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr0000 = fiftyFifty.delitLeft(arr00001);
        arr0001 = fiftyFifty.delitRight(arr00001);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr0000, arr0001);   // заброс выбранных коллекций в общую
        System.out.println(arr000);
    }

    //+++++++++++++++++++++++++ 8 - 8 +++++++++++++++++++++++++++++++++++++++

    void arr0000() {// ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr000 = fiftyFifty.delitLeft(arr0000);
        arr001 = fiftyFifty.delitRight(arr0000);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr000, arr001);   // заброс выбранных коллекций в общую
    }

    void arr0001() { // ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr000 = fiftyFifty.delitLeft(arr0001);
        arr001 = fiftyFifty.delitRight(arr0001);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr000, arr001);   // заброс выбранных коллекций в общую
    }

    //+++++++++++++++++++++++++ 4 - 4 +++++++++++++++++++++++++++++++++++++++

    void arr000() {// ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr00 = fiftyFifty.delitLeft(arr000);
        arr01 = fiftyFifty.delitRight(arr000);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr00, arr01);   // заброс выбранных коллекций в общую
    }

    void arr001() { // ----------ВЫБРАЛ ЛЕВУЮ КОЛОНКУ list0-----------//деление левой на два
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr00 = fiftyFifty.delitLeft(arr001);
        arr01 = fiftyFifty.delitRight(arr001);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr00, arr01);   // заброс выбранных коллекций в общую
    }

    //+++++++++++++++++++++++++ 2 - 2 +++++++++++++++++++++++++++++++++++++++


    void arr00() {
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr0 = fiftyFifty.delitLeft(arr00);
        arr1 = fiftyFifty.delitRight(arr00);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr0, arr1);   // заброс выбранных коллекций в общую
    }

    void arr01() {
        FiftyFifty fiftyFifty = new FiftyFifty();
        arr0 = fiftyFifty.delitLeft(arr01);
        arr1 = fiftyFifty.delitRight(arr01);

        LeftRight leftRight = new LeftRight();
        leftRight.LbodyR(arr0, arr1);   // заброс выбранных коллекций в общую
    }
}
