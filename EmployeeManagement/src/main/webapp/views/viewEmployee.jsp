<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<table border="10">
    <tr>
        <th>EmpId</th>
        <th>EmpName</th>
        <th>Designation</th>
        <th>Email</th>
        <th>Mobile_No</th>
        <th>Gender</th>
        <th>City</th>
        <th>State</th>
        <th>Country</th>
        <th>Address</th>
        <th>Delete</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="emp" items="${employee}">
        <tr>
            <td>${emp.empId}</td>
            <td>${emp.empName}</td>
            <td>${emp.desg}</td>
            <td>${emp.email}</td>
            <td>${emp.mobileNo}</td>
            <td>${emp.gender}</td>
            <td>${emp.city}</td>
            <td>${emp.state}</td>
            <td>${emp.country}</td>
            <td>${emp.address}</td>
            <td>
                <a href="/delete/${emp.empId}">Delete</a>
            </td>
            <td>
                <a href="/edit/${emp.empId}">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>