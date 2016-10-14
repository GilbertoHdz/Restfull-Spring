<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  Restfull 0.0.1
  jsp
  
  <form:form modelAttribute="test" action="" method="POST">
  <form:errors/>
  <br/>
  <form:label path="username">username :</form:label>
  <form:input path="username"/>
  <form:errors path="username"></form:errors>
  <br/>
  <form:label path="email">email :</form:label>
  <form:input path="email"/>
  <form:errors path="email"></form:errors>
  
<!--   <br/> -->
<!--   <form:label path="password"> password:</form:label> -->
<!--   <form:input path="password"/> -->
<!--   <form:errors path="password"></form:errors> -->
  <br/>
  <button type="submit">Guardar</button>
  <br/>

  <a href="">Cancelar</a>
</form:form>
  
</body>
</html>