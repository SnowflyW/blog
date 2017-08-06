<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>个人博客-登陆</title>
    <body>
    <p><span style="color: red">${msg}</span></p>
        <form action="${pageContext.request.contextPath}/users/login" method="post">
        <table cellpadding="1" cellspacing="0">
            <tr>
                <td>用户名：</td>
                <td><input id="username" name="userName" type="text" placeholder="用户名"/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input id="password" name="password" type="password" placeholder="密码"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit">登陆</button>
                </td>
            </tr>
        </table>
            <a href="${pageContext.request.contextPath}/users/toReg">注册用户</a>
        </form>
    </body>
</html>
