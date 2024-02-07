<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2/7/2024
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Choose Your Path</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .container {
            text-align: center;
        }

        h1 {
            color: #333;
        }

        .options {
            display: flex;
            justify-content: space-around;
            margin-top: 20px;
        }

        .button {
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        .convert {
            background-color: #4CAF50;
            color: white;
        }

        .admission {
            background-color: #2196F3;
            color: white;
        }

        .button:hover {
            background-color: #555;
        }

        .footer {
            margin-top: 30px;
            font-size: 14px;
            color: #777;
        }
        #user{
            text-align: center;
            color: #2196F3;
        }
    </style>
</head>
<body>
<br><br><br><br>
<div>
    <h1 id="user">${username}</h1>
</div>
<br>
<div class="container">
    <h1>Choose Your Path</h1>
    <div class="options">
        <button class="button convert" ><a href="numberConverter.jsp">Go to number Converter Page</a></button>
        <button class="button admission" ><a href="admission.jsp">Go to Student Admission Page</a></button>
    </div>
    <div class="footer">
        Made with ❤️ by Eng.Ny@nja
    </div>
</div>

</body>
</html>
