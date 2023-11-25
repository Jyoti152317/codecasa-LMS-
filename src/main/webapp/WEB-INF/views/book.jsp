<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Books</h2>
    <table border="1">
        <tr>
            <th>Title</th>
            <th>Author</th>
            <th>Action</th>
        </tr>
       <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>
                    <a href="/books/${book.id}">View</a>
                    <a href="/books/delete/${book.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h2>Add New Book</h2>
    <form action="/books/add" method="post">
        Title: <input type="text" name="title"><br>
        Author: <input type="text" name="author"><br>
        <input type="submit" value="Add Book">
    </form>
</body>
</html>