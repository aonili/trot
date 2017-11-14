<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"
  +request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<base href = "<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>

<body>

<%String EMPTY=""; 
String errorMsg = request.getAttribute("error")==null ?EMPTY:(String)request.getAttribute("error");
   String id = request.getAttribute("id")==null ?EMPTY:(String)request.getAttribute("id");
%>
<div id="errorMsg" style="text-align:center;color:red;fond-size:12px"><%=errorMsg %></div>
  <div>
   <form action= "LoginServlet" method = "post">
    ID       : <input type="text" id="id" name = "id" size ="18" value=<%=id %>>
    Password : <input type="password" id="password" name="password" size="18"> 
  <input type="submit" value="Submit">
   </form>
  </div>

</body>
</html>