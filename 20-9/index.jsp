<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<script type="text/javascript">

		var request=new XMLHttpRequest(); 
	
			function searchdata()
			{
				var data = document.myform.email.value;  
				var url = "ajaxsearch.jsp?val="+data;
				
				try
				{
					request.onreadystatechange = function()
					{
						if(request.readyState==4)
						{  
							var val=request.responseText;  
							document.getElementById('tops').innerHTML=val;  
						}  
						
						
					}
					
					request.open("GET",url,true);  
					request.send();  
						
					
				}
				catch(e)
				{
					alert("Unable to connect to server");
				}
				
				
				
				
			}

	</script>


</head>
<body>


	<form action="ajaxsearch.jsp" name="myform" method="post">
	
		<p>
			<input type="email" name="email" onblur="searchdata()">
		</p>
		
		<span id="tops"></span> 
		
	
	</form>

</body>
</html>