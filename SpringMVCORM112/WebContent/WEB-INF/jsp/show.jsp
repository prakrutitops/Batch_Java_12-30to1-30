<%@page import="com.model.Person"%>
<%@page import="java.util.List"%>
<%@page import="com.bo.MyBo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="insert1">Add Data</a>

	<%
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) acm.getBean("bo");
		List<Person> list = bo.getall();
	%>
	
	<table border="1" cellspacing="5px" cellpadding="5px">
		
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
			<th>Edit</th>
			<th>Delete</th>
			
		</tr>
		<% 	
			for(Person p1 :list)
			{
			
		%>
	
	
		<tr>
			<td><%=p1.getId() %></td>
			<td><%=p1.getName() %></td>
			<td><%=p1.getAddress() %></td>
			<td>
				<form name="edit" method="post" action="edit">
					<input type="hidden" name="id" value="<%=p1.getId()%>">
					<input type="submit" name="action" value="Edit">
				</form>
			</td>
			<td>
				<form name="delete" method="post" action="delete">
					<input type="hidden" name="id" value="<%=p1.getId()%>">
					<input type="submit" name="action" value="Delete">
				</form>
			</td>
			
		</tr>
		
		<%
			}
		%>
	
	</table>
	
	
	

</body>
</html>