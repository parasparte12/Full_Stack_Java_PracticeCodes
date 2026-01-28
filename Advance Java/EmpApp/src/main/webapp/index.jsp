<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Register Here...</h1>
<p style='color:green'>${message}</p>
<form action="save" method="post">

<table>
<tr>
<td>Enter Name :</td>
<td><input type="text" name="name"/></td>
</tr>
<tr>
<td>Enter Email :</td>
<td><input type="email" name="email"/></td>
</tr> 
<tr>
<td>Enter Password :</td>
<td><input type ="password" name="password"/></td>
</tr>

<tr>
<td>Choose city :</td>
<td><select name ="city">

<option>Pune</option>
<option>Mumbai</option>
<option>Ratnagiri</option>
<option>UK</option>



</select></td>
</tr>

</table>
<input type="submit">


</form>

</body>
</html>