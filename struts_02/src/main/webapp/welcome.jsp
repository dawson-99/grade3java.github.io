<%--
  Created by IntelliJ IDEA.
  User: xuruihang
  Date: 2022/10/20
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片展示页面</title>
</head>
<body>
    <img src="" id="picture" alt="加载失败">
</body>

<script>
    var i = 0;
    <%--if (i === 0){--%>
    <%--    var file = "images/" + "${picFileFileName}";--%>
    <%--    document.getElementById("picture").src = file;--%>
    <%--    i++;--%>
    <%--} else {--%>
    <%--    var file = "images2/" + "${picFileFileName}";--%>
    <%--    document.getElementById("picture").src = file;--%>
    <%--}--%>


        var file = "<%= session.getAttribute("path")%>" + "${picFileFileName}";
        document.getElementById("picture").src = file;
</script>
</html>
