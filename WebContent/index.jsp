<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculo IMC</title>
</head>
<body>
      <h3>Claculadora de IMC</h3>
      <br/>
      
      <form action="calcularImc" method="post">
      
        <input type="text" id="peso" name="peso" placeholder="Peso">
        <br/>
        <input type="text" id="altura" name="altura" placeholder="Altura">
        <br/>
        <input type="submit" value="Calcular">

      </form>
      <br/>
      <br/>
      <h3>Resultado</h3>
      <br/>    
      <input type="text" size="10" value="<%= request.getAttribute("imc")%>">
      
</body>
</html>