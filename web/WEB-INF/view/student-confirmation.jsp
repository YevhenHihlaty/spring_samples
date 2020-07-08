

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
Student is Confirmed: ${student.firstName} ${student.lastName}
<br><br>

Country: ${student.country}
<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>
Operating Systems:

<ul>
    <c:forEach var="temp" items="${student.operationSystem}">
    <li>${temp}</li>
    </c:forEach>
</ul>
<br><br>
</body>
</html>
