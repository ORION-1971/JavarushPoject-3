<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        body {
            background-image: url('img/scale.jpg');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
        }
        .button1 {
            width: 70px;
            height: 30px;
        }

        .button1:hover {
            background-color: coral
        }

        .button1:active {
            background-color: #3e8e41;
            box-shadow: 0 5px #666;
            transform: translateY(4px);
        }

        .button1 {
            box-shadow: 0 12px 6px 0 rgba(0, 0, 0, 0.7), 0 20px 50px 0 rgba(0, 0, 0, 0.4);
        }

        .form {
            width: 140px;
            height: 30px;
        }

        .form {
            box-shadow: 0 12px 6px 0 rgba(0, 0, 0, 0.7), 0 20px 50px 0 rgba(0, 0, 0, 0.4);
        }
    </style>
</head>
<body>
<div align=center class=print>
    <h1> "Карточный фокус" </h1>

    <h3> Математические фокусы с картами относятся к категории простейших.
        <br>Основной их плюс конечно же в том, что они не требуют ни ловкости рук, ни реквизита.
        <br>Однако есть и минус – разгадать эти фокусы совсем не сложно.
        <br>Одними из самых простых являются фокусы по угадыванию карт, выбранных из колоды.
    </h3>

    <form action="/start" method="post">
        <div class="container">
            <label for="inputUser" class="visually-hidden"><h4>Прежде чем начать давай познакомимся - </h4></label>
            <input type="text" class="form" name="username" id="inputUser" placeholder="Имя игрока">
            <br><br>
            <button class="button button1" type="submit"><b>Начать</b></button>
        </div>
    </form>
    <br>
    <a href="test"><h3>Тест</h3></a>
        
</div>
</body>
</html>