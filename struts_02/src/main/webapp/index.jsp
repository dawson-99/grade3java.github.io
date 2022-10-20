<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
        <s:form action="upload" method="post" enctype="multipart/form-data">
            <s:file name="picFile" label="image"/>
            <s:submit name="用户1上传" value="用户1上传"/>
            <s:submit name="用户2上传" value="用户2上传"/>
        </s:form>
</body>
</html>
