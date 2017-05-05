<%--
  Created by IntelliJ IDEA.
  User: zhg-pc
  Date: 17/5/5
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="shortcut icon" href="/images/test.jpg" type="image/x-icon" />
    <link href="/css/main.css" rel="stylesheet" type="text/css">
    <script src="/js/jquery-3.1.0.js" type="text/javascript"></script>
    <title>${title}</title>
</head>
<body>

<section class="DoctorLoginWrape">
    <article class="login-item">
        <h4 class="big-title">用户登录</h4>
        <form>
            <article class="form-article">
                <article class="corner-l-f"></article>
                <article class="corner-l"></article>
                <ul class="form-article-ul">
                    <li>
                        <img src="/images/shouji_icon.png" width="19.5" height="25.5" class="form-icon"/>
                        <div class="control-form">
                            <input type="text" class="form-input" name="username" value="" placeholder="数据库账号"/>
                        </div>
                    </li>

                    <li>
                        <img src="/images/mima_icon.png" width="22.5" height="23" class="form-icon form-icon-1"/>
                        <div class="control-form">
                            <input type="password" class="form-input" name="password" placeholder="数据库密码"/>
                        </div>
                    </li>
                </ul>
                <article class="corner-r"></article>
                <article class="corner-r-f"></article>

                <div class="login-forgetpassword">
                    <a class="login-forgetpassword-a" href="${register}">忘记密码?</a>
                </div>

                <button type="button" class="green-btn login">登录</button>
            </article>
        </form>
    </article>
</section>


</body>
</html>
