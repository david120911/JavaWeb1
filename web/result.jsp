<%--
  Created by IntelliJ IDEA.
  User: richard
  Date: 2017/2/25
  Time: 下午8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p></p>
<%
    List styles = (List)request.getAttribute("styles");
    Iterator it = styles.iterator();
    while (it.hasNext()){
        out.print(" <br> try: "+it.next());
    }
%>

</body>
</html>
