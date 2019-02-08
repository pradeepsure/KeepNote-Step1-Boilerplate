
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KeepNote</title>
</head>
<body>
	<h2>Keep Notes</h2>
	<form:form method="POST" action="saveNote">
		<table>
			<tr>
				<td><form:label path="noteId">Note_id</form:label></td>
				<td><form:input path="noteId" /></td>
			</tr>
			<tr>
				<td><form:label path="noteTitle">Note_title</form:label></td>
				<td><form:input path="noteTitle" /></td>
			</tr>
			<tr>
				<td><form:label path="noteContent">Note_content</form:label></td>
				<td><form:input path="noteContent" /></td>
			</tr>
			<tr>
				<td><form:label path="noteStatus">Status</form:label></td>
				<td><form:input path="noteStatus" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Save Note" /></td>
			</tr>
		</table>
	</form:form>

	<hr />
	<h2>List of Notes</h2>
	<table border="1">
		<thead style="font-weight: bold">
			<td>Id</td>
			<td>Title</td>
			<td>Content</td>
			<td>Status</td>
			<td>createdOn</td>
			<td>Action</td>
		</thead>
		<c:forEach var="notee" items="${notes}">
			<tr>
				<td>${notee.noteId}</td>
				<td>${notee.noteTitle}</td>
				<td>${notee.noteContent}</td>
				<td>${notee.noteStatus}</td>
				<td>${notee.createdAt}</td>
				<td><form action="deleteNote" method="post">
						<input type="hidden" id="noteId" name="noteId"
							value="${notee.noteId}" />
						<button type="submit">Delete</button>
					</form></td>
			</tr>
			<br />
		</c:forEach>
	</table>

</html>