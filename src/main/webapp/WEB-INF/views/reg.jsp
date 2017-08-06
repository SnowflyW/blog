<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <title>个人博客-注册</title>
    <body>

        <div align="center">
            <p>
                <c:if test="${msg != null && fn:length(msg) > 0}">
                    <c:forEach var="m" items="${msg}">
                        <span style="color: red">${m.message}</span><br/>
                    </c:forEach>
                </c:if>
            </p>

            <form action="${pageContext.request.contextPath}/users/reg" method="post">
            <table style="height: 500px; text-align: center;" width="500" cellpadding="1" cellspacing="1" border="1">
                <tr>
                    <td>用户名：</td>
                    <td><input id="username" name="userName" type="text" placeholder="用户名"/></td>
                </tr>

                <tr>
                    <td>密码：</td>
                    <td><input id="password" name="password" type="password" placeholder="密码"/></td>
                </tr>

                <tr>
                    <td>昵称：</td>
                    <td><input id="nickname" name="nickName" type="text" placeholder="昵称"/></td>
                </tr>

                <tr>
                    <td>邮箱：</td>
                    <td><input id="email" name="email" type="text" placeholder="邮箱"/></td>
                </tr>

                <tr>
                    <td colspan="2">
                        <button type="submit">注册</button>
                        <button type="reset">重置</button>
                    </td>
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>
