<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
    <script type="text/javascript">
        function user_submit() {
            document.getElementById("form").action = "login-userLogin";
            form.submit();
        }
        function admin_submit() {
            document.getElementById("form").action = "login-adminLogin";
            form.submit();
        }
    </script>
</head>
<body>


    <s:form id="form" method="post" action="" validate="true">
            <s:textfield name="username" label=" 用户名"/>
            <s:textfield name="password" label=" 密码"/>
            <s:textfield name="email" label=" 邮箱"/>
        <s:submit type="button" value="用户登录" onclick="user_submit()"/>
        <s:submit type="button" value="管理员登录" onclick="admin_submit()"/>
    </s:form>
<p style="color: red">对管理员的验证是账号密码必须是admin，对其他用户必须是账号密码相同</p>
</body>
</html>
