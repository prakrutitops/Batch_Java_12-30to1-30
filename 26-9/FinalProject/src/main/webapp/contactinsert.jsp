<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	 <jsp:useBean id="m" class="com.model.ContactModel"/>
	 <jsp:setProperty property="*" name="m"/>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	int status = Dao.contactinsert(m);
	
	if(status>0)
	{
		
	%>
	
	<form  action="https://api.web3forms.com/submit"  method="post" >
			
			<input type="hidden" name="access_key" value="e5f298f4-bab2-4741-9090-2e268b5e3a1a">
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="fullname" class="form-control" placeholder="Full name"
					type="hidden" id="name" value="<%=m.getFullname()%>">
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="email" class="form-control" placeholder="Email"
					type="hidden" id="email" value="<%=m.getEmail()%>">
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="mobileno" class="form-control" placeholder="Email"
					type="hidden" id="email" value="<%=m.getMobileno()%>">
			</div>
			
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-user"></i>
					</span>
				</div>
				<input name="feedback" class="form-control" placeholder="feedback"
					type="hidden" id="feedback" value="<%=m.getFeedback()%>">
			</div>
			
			<!-- form-group// -->
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">
					Send Email
				</button>
			</div>
			
		</form>
		<span id="tops"></span>
		</article>
	</div>
	
	
	
	<% 	
		//response.sendRedirect("");
	}
	else
	{
		
	}

	%>
	
	


</body>
</html>