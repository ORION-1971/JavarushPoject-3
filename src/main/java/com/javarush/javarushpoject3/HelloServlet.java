package com.javarush.javarushpoject3;

import java.io.*;

import com.javarush.javarushpoject3.logica.Denominator;
import com.javarush.javarushpoject3.logica.Searching;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static com.javarush.javarushpoject3.logica.Denominator.*;

@WebServlet(name = "Servlet", value = "/start")
public class HelloServlet extends HttpServlet {

    Denominator denominator = new Denominator();
    Dialog dialog = new Dialog();
    Searching searching = new Searching();
    public static String user;
    boolean usr = true;
    int step = 0;
    int game = 1;
    boolean non = true;
    boolean isStep = false;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        session.setAttribute("username", user);
        session.setAttribute("game", game);
        if (usr) {
            user = request.getParameter("username");
            usr = false;
        }
        //response.setContentType("text/html");
        String button = request.getParameter("button");
        System.out.println(user + " press " + button);

        if (button != null) {
            if (step == 0 && non) {
                if (button.equals("1")) {    //нажатие левой кнопки
                    dialog.talk = 1;          // заманчивое предложение
                    dialog.show();
                    request.setAttribute("message", messages);
                    non = false;
                }
                if (button.equals("2")) {   //нажатие правой кнопки   --  конец игры
                    getServletContext()
                            .getRequestDispatcher("/index.jsp")
                            .forward(request, response);
                }
            }else
            if (step > 0) {
                if (button.equals("1")) {    //нажатие левой кнопки
                   searching.messaging1(step);
                }
                if (button.equals("2")) {   //нажатие правой кнопки
                    searching.messaging2(step);
                }
                if (step < 8 && (button.equals("1") || button.equals("2"))) {
                    dialog.talk = step + 2;
                    dialog.resp1 = step + 1;
                    dialog.resp2 = step + 1;
                    dialog.show();
                    request.setAttribute("message", messages);
                    request.setAttribute("respon1", respon1);
                    request.setAttribute("respon2", respon2);
                    step++;
                }
                if (step < 7&& (button.equals("1") || button.equals("2"))) {
                    denominator.koloda();
                    request.setAttribute("list", list52);
                    request.setAttribute("message", messages);
                }
            } else

            if (step == 0 && isStep) {
                if (button.equals("1")) {    //готов
                    denominator.koloda();
                    request.setAttribute("list", list52);
                    dialog.talk = 2;
                    dialog.resp1 = 1;
                    dialog.resp2 = 1;
                    dialog.show();
                    request.setAttribute("message", messages);
                    if (step == 0) step++;
                }else
                if (button.equals("2")) {   //нажатие правой кнопки
                }
            }else request.setAttribute("message", messages);

            if (button.equals("4") && isStep) {                  // Начать с начала
                list52.clear();
                SOLID = "";
                request.setAttribute("list", list52);
                step = 0;
                dialog.talk = 1;
                dialog.resp1 = 0;
                dialog.resp2 = 0;
                dialog.show();
                request.setAttribute("message", messages);
                game++;
            }
            if (button.equals("3")) {                  // Тасовка колоды

                denominator.koloda();
                request.setAttribute("list", list52);
                dialog.show();
                request.setAttribute("message", messages);
                isStep = true;
            }
            System.out.println("step = " + step);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/pochta.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)           // метод запроса
            throws IOException, ServletException
    {
        doGet(request, response);
    }
}