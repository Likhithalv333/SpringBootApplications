<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
  





<table border="1">
    <tr>
        <th>stdRollNo</th>
        <th>name</th>
        <th>course</th>
        <th>HibernateMarks</th>
        <th>SpringMarks</th>
        <th>SpringBootMarks</th>
        <th>totalMarks</th>
        <th>percentage</th>
        <th>grade</th>
        <th>result</th>
        <th>Delete</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="std" items="${students}">

        <tr>
            <td>${std.stdRollNo}</td>

            <td>${std.name}</td>
            <td>${std.course}</td>
            <td>${std.hibernate}</td>
            <td>${std.spring}</td>
            <td>${std.springBoot}</td>
            <td>${std.total}</td>
            <td>${std.percentage}</td>
            <td>${std.grade}</td>
            <td>${std.result}</td>
            <td>
                <a href="/delete/${std.stdRollNo}">Delete</a>

            </td>
            <td>
                <a href="/edit/${std.stdRollNo}">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
