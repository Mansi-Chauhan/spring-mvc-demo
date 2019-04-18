
<!DOCTYPE html>
<html>

<head>
<title>Welcome</title>
</head>

<body>
	Student's NAme: ${param.studentname}

	<br>
	<br> From Model: ${message}

	<br>
	<br> From Model using request param: ${message2}


	<br> TRYING:
	<br> LAST: ${myClass.lastName }
	<br> first: ${myClass.firstName } ${myClass.country}
	<br>
	Gender: ${myClass.gender }
	<br>
	I love to eat:
	<ul>
	<c:forEach var="meal" items="${myClass.food}">
	   <li>${meal}</ul>
	</c:forEach>
	</ul>

</body>
</html>