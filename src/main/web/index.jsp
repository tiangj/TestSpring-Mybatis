<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/5/5
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <form action="test/uploadFile.do" method="post"  enctype="multipart/form-data">
          文件:<input type="file" name="fileName"><br/>
          文件1:<input type="file" name="fileNameInfo">
        <input type="submit" value="提交">
      </form>
  $END$
  </body>
</html>
