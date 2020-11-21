<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%-- JSTL (Jsp Standard Tag Library) 선언 --%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>이벤트 목록</h1>
    <h2>${message}</h2> <%-- EL 표현식으로 Model에 담아놓은 객체들을 참조 가능 --%>
    <table>
        <tr>
            <th>이름</th>
            <th>시작</th>
        </tr>
        <c:forEach items="${events}" var="event">
            <tr>
                <td>${event.name}</td>
                <td>${event.starts}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
