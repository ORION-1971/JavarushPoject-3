package com.javarush.javarushpoject3.helper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


@WebServlet("/test")
public class Start extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HttpSession session = request.getSession();
        Enumeration<String> attributeNames = session.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            System.out.println(attributeName + " : " + session.getAttribute(attributeName));
        }
        session.setAttribute("one++++++", "two");
        System.out.println(session.getId());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Start</title>");
        out.println("</head>");
        out.println("<body> <div align=\"center\" class=\"fst-italic\">");
        out.println("<h1>Servlet Start at " + request.getContextPath() + "</h1>");
        out.println("<h3>Request Parameters Example - 1</h3>");
       out.println("Parameters in this request:<br>");

//        String firstName = request.getParameter("firstname");                  // переменная фамилия
//        String lastName = request.getParameter("lastname");

        String aaa = request.getParameter("aaa");
        System.out.println(aaa + " getParameter: " + request.getParameter("aaa"));

        if (aaa != null) {
            if (aaa.equals("1")) {
                out.println("Ни хрена себе один" + "<br>" +
                        "<img src = img/8.svg alt= 10  width= 120  height=180> ");
            }
            if (aaa.equals("2")) {
                out.println("Че за фигня вторая" + "<br>" +
                        "<img src = img/13.svg alt= 20  width= 120  height=180>");
            }
        }


        out.println("<form action= /test method= post>" +
                "<button type= submit id = java1  name = aaa value = \"1\">Нажми один!</button>" +
                "<button type= submit id = java2  name = aaa value = \"2\">Нажми два!</button>" +
                "</form>");
        out.println("система Ниппель = " + aaa);



        out.println("<table style= width:0% >" +
                "<tr> <td><img src = img/0.svg alt= 1  width= 120  height=180></td>" +
                "<td><img src =  img/5.svg  alt= 2  width= 120  height= 180 ></td>" +
                "</tr> </table>");

        out.println("</div></body>");
        out.println("</html>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)           // метод запроса
            throws IOException, ServletException
    {
        doGet(request, response);
    }
}
