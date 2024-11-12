<%@ page import="static com.javarush.javarushpoject3.logica.Denominator.SOLID" %>
<%@ page import="static com.javarush.javarushpoject3.logica.Denominator.messages" %>
<%@ page import="static com.javarush.javarushpoject3.logica.Denominator.respon1" %>
<%@ page import="static com.javarush.javarushpoject3.logica.Denominator.respon2" %>
<%@ page import="static com.javarush.javarushpoject3.HelloServlet.user" %><%--
  Created by IntelliJ IDEA.
  User: ORION
  Date: 30.10.2024
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            background-image: url('img/scale.jpg');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
        }
        table, th, td {
            /*border: 0px solid white;*/
            border-collapse: collapse;
        }
        th, td {
            /*padding: 2px;*/
            /*background-color: #39ac6b;*/
        }
        .button1 {width: 120px; height: 40px;}
        .button1:hover {background-color: coral}
        .button1:active {
            background-color: #3e8e41;
            box-shadow: 0 5px #666;
            transform: translateY(4px);}
        .button1 {box-shadow: 0 12px 6px 0 rgba(0,0,0,0.7), 0 20px 50px 0 rgba(0,0,0,0.4);}
        .shadow {filter: drop-shadow(10px 10px 7px black);}
    </style>
</head>
<body>

<div align=center class=print>
    <table style="width:90%">
        <tr style="height:1%">
            <th colspan="11"><p style="color:navy; font-size:30px;">"Пиковая дама"</p></th>
        </tr>
        <tr style="height:1%">
            <td style=width:100px></td>
            <th colspan="4"><p style="color:yellow; font-size:15px;">Левая сторона</p></th>
            <th>
                <form action="start" method=post>
                    <button class="button button1" type=submit id=java3 name=button value="3"><b>Перетасовать <br>колоду</b></button>
                </form>
            </th>
            <th colspan="4"><p style="color:yellow; font-size:15px;">Правая сторона</p></th>
        </tr>
        <tr>
            <td></td>
            <td><img class="shadow" src=${list[0]} alt=0 width=80 height=120></td>
            <td><img src=${list[1]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[2]} alt=0 width=80 height=120></td>
            <td><img src=${list[3]} alt=0 width=80 height=120></td>
            <th rowspan="1">
                <p style="color:black; font-size:18px; background-color:powderblue;">
                    <% if (messages.isEmpty()) { %> Добро пожаловать, <br>
                    в мой таинственный клуб! <br><% out.println(user);%>, желаешь ли ты испытать на себе <br> магическое воздействие моего трюка?
                    <% } else { %> ${message} <% ;} %>
                </p>
            </th>
            <td><img src=${list[16]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[17]} alt=0 width=80 height=120></td>
            <td><img src=${list[18]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[19]} alt=0 width=80 height=120></td>
            <td style=width:100px></td>
        </tr>
        <tr>
            <td></td>
            <td><img src=${list[4]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[5]} alt=0 width=80 height=120></td>
            <td><img src=${list[6]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[7]} alt=0 width=80 height=120></td>
            <th style=width:40%>
                <form action="start" method=post>
                    <button class="button button1" type=submit id=java1 name=button value="1">
                        <b> <% if (respon1.isEmpty()){ %>Заманчивое предложение
                            <% } else { %> ${respon1} <% ;} %> </b></button> <br>
                    <div align=center class=print>
                    <p style="color:black; font-size:12px; width: 140px; background-color:powderblue;">
                    сделай свой выбор <br>
                    </p></div>
                    <button class="button button1" type=submit id=java2 name=button value="2">
                        <b> <% if (respon2.isEmpty()){ %>Меня это уже настораживает
                            <% } else { %> ${respon2} <% ;} %> </b></button>
                </form>
            </th>
            <td><img class="shadow" src=${list[20]} alt=0 width=80 height=120></td>
            <td><img src=${list[21]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[22]} alt=0 width=80 height=120></td>
            <td><img src=${list[23]} alt=0 width=80 height=120></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td><img class="shadow" src=${list[8]} alt=0 width=80 height=120></td>
            <td><img src=${list[9]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[10]} alt=0 width=80 height=120></td>
            <td><img src=${list[11]} alt=0 width=80 height=120></td>
            <th>
                <% if (SOLID.isEmpty()) {%>
                <img class="shadow" src=img/wing.png alt=1 width=120 height=120>
                <% } else { %>
                <img class="shadow" src=${SOLID} alt=1 width=80 height=120>
                <% } %>
            </th>
            <td><img src=${list[24]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[25]} alt=0 width=80 height=120></td>
            <td><img src=${list[26]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[27]} alt=0 width=80 height=120></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td><img src=${list[12]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[13]} alt=0 width=80 height=120></td>
            <td><img src=${list[14]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[15]} alt=0 width=80 height=120></td>
            <th><form action="start" method=post>
                <button class="button button1" type=submit id=java4 name=button value="4"><b>Начать сначала</b></button>
            </form></th>
            <td><img class="shadow" src=${list[28]} alt=0 width=80 height=120></td>
            <td><img src=${list[29]} alt=0 width=80 height=120></td>
            <td><img class="shadow" src=${list[30]} alt=0 width=80 height=120></td>
            <td><img src=${list[31]} alt=0 width=80 height=120></td>
            <td></td>
        </tr>
    </table>
</div>
    <p style="color:black; font-size:13px; width: 180px; background-color:powderblue;">
        Статистика:<br>
    <a href="https://yoip.ru" ><img src="https://yoip.ru/i/?im=4"  border="0" height="31" width="88"/></a><br>
        Имя в игре: ${username}<br>
        Количество игр: ${game}        </p>

</body>
</html>
