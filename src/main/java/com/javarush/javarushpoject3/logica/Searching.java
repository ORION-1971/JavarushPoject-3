package com.javarush.javarushpoject3.logica;


public class Searching {
    Guess guess = new Guess();

    public void messaging1(int step) {
        switch(step){
            case 2: guess.arr00000();  break;
            case 3: guess.arr0000();  break;
            case 4: guess.arr000();  break;
            case 5: guess.arr00();  break;
            case 6: guess.arr0(); break;
        }
    }

    public void messaging2(int step) {
        switch(step){
            case 2: guess.arr00001();  break;
            case 3: guess.arr0001();  break;
            case 4: guess.arr001();  break;
            case 5: guess.arr01();  break;
            case 6: guess.arr1();  break;
        }
    }
}