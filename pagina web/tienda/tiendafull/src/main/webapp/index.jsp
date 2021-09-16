<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″ >
<title>Tienda virtual</title>
<link rel="stylesheet" href="css/style1.css">
</head>
<body>
<div class="login-box">
	<h1>Bienvenido a la tienda génerica</h1>
	<h2>Iniciar sesión</h2>
	<form method="get" action="./tv_Servlet">
	
	<label>Usuario: </label>
	<input type="text" name="usuario">
	<label>Contraseña: </label>
	<input type="password" name="contraseña">
	
	<input type="submit" value="Ingresar">
	<input type="reset" value="Cancelar">
	
	</form>
	</div>
</body>
</html>