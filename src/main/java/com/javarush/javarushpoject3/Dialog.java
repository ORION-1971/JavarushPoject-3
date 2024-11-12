package com.javarush.javarushpoject3;
import static com.javarush.javarushpoject3.logica.Denominator.*;
import static com.javarush.javarushpoject3.HelloServlet.user;

public class Dialog {
    public int talk;
    public int resp1 = 0;
    public int resp2 = 0;
    public void show() {
       switch (talk){
           case 0: messages = user +", желаешь ли ты испытать на себе <br> магические воздействия моих трюков?" ; break;
           case 1: messages = "Отлично, хорошо перетасуй колоду карт<br> и в дальнейшем выполняй все мои указания,<br> я ввиду тебя в гипнотическое состояние"; break;
           case 2: messages = "Хорошо, тогда продолжим. <br> Запомни одну из увиденных перед тобой карт, <br> но лучше запиши ее на листке бумаги"; break;
           case 3: messages = "И так, смотри внимательно!<br> Твой взгляд устремлен в Левую часть экрана <br> И ты пристально смотришь на свою карту<br> Надеюсь ты ее там видишь?"; break;
           case 4: messages = "Я ввожу тебя в состояние транса,<br> ты находишься под моим контролем... <br> Смотри в Правую часть экрана... <br>Твоя карта мерцает перед твоими глазами"; break;
           case 5: messages = "Я конечно знаю, что ты выбрал пиковую даму,<br> но не будем спешить. <br>Три раза перетасуй колоду. Знакомая тебе карта <br>  переместится на противоположную сторону."; break;
           case 6: messages = "Теперь внимательно!<br> Левой кнопкой мыши возьми свою карту. <br> Удерживая кнопкой, перемести ее под колоду <br>в центре экрана.<br> Твоя карта осталась на месте, но дух ее лежит в колоде<br> Вопрос - в каком направлении была смещена карта?"; break;
           case 7: messages = "И так, ты под полным контролем гипноза<br>Смотри в центр экрана и отдали свой взгляд так,<br> чтоб каждым глазом ты видел свою часть экрана<br> Скажи мне - каким глазом ты видишь карту?"; break;
           case 8: messages = "Хлоп! (в ладоши)<br> Ты выходишь из состояния гипноза <br> Сводишь свой взгляд на карту в центр экрана.<br> Если это твоя выбранная карта, <br> значит ты все сделал правильно - магия удалась!";break;
           case 9: messages = user + "<br>Вас приветствует клуб \"Пикова дама\" <br>Не хотите ли вы с играть с начала?"; break;
       }

       switch (resp1){
           case 0: respon1 = " Готов "; break;
           case 1: respon1 = "Да, я запомнил ее"; break;
           case 2: respon1 = "Да, она здесь"; break;
           case 3: respon1 = "Нет не угадал"; break;
           case 4: respon1 = "Так она вроде слева и была"; break;
           case 5: respon1 = "Слева на право"; break;
           case 6: respon1 = "Левым глазом"; break;
           case 7: respon1 = "Кто я? "; break;
       }

        switch (resp2){
            case 0: respon2 = " ^ "; break;
            case 1: respon2 = "Как - то все сложно..."; break;
            case 2: respon2 = "Ее там нет...!"; break;
            case 3: respon2 = "Даа я ее вижуу..."; break;
            case 4: respon2 = "Да ни черта, справа она"; break;
            case 5: respon2 = "Взял справа, но она пропала"; break;
            case 6: respon2 = "Правым глазом"; break;
            case 7: respon2 = "Где я?"; break;
        }

    }

}
