<%@ page import="org.slf4j.Logger" %>
<%@ page import="org.slf4j.LoggerFactory" %>
<%
    Logger logger = LoggerFactory.getLogger("IndexJSP");
    logger.info("index.jsp page accessed");
%>
<html>
<body>
<h1><center> Welcome to my Webapp </center></h1><br><br>
<h1><center> Made by Nshuti Ngabo Yvan 25536</center></h1><br><br>
<h1><center> Fill in student information</center></h1><br><br>
<form action="hello-servlet" method="post">
    <center>
        Enter your name : <input type="text" name="stuname"><br><br>
        Enter your ID : <input type="text" name="stid"><br><br>
        <input type="submit">
    </center>
</form>
</body>
</html>