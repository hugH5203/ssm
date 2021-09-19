<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<body>
<h2>Hello World!</h2>
<a href="user/findAll">测试spring与springMVC的整合</a>  <br>
<a href="user/SfindAll">测试spring与springMVC的整合</a>  <br>
<br>

<form action="user/saveUser" method="post">
    id：<input type="text" name="id"/> <br/>
    职业：<input type="text" name="role_name"/> <br/>
    描述：<input type="text" name="role_desc"/> <br/>
    <input type="submit" value="提交" /> <br/>
</form>

</body>
</html>
