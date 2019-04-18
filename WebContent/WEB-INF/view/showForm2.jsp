<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<title>Showing you the form</title>

</head>
<body>

	<form:form action="processForm4" modelAttribute='myClass'>

		<br>
		<br>  
        First name: <form:input path="firstName" />
		<br>
		<br>  
        Last name: <form:input path="lastName" />
		<br>
		<br>	
		country: <form:select path="country" >
		
		         <form:options items="${myClass.countryList}" ></form:options>
		       
		 </form:select>
		 <br>
		 Gender:
		 Male: <form:radiobutton path="gender" value="male"/>
		 Female:<form:radiobutton path="gender" value="female"/>
		
		<br>
		
		Food:
		Burger<form:checkbox path="food" value="burger"/><br>
	    Fries<form:checkbox path="food" value="fries"/><br>
	    Coke<form:checkbox path="food" value="coke"/><br>
	    Chips<form:checkbox path="food" value="chips"/>	
	     
	    <br>     
		<input type="submit" value="Submit" />
	</form:form>



	<p>hsbxhasbxkja</p>
</body>




</html>