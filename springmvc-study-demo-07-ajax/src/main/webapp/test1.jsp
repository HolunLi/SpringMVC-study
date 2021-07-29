<%--
  Created by IntelliJ IDEA.
  User: Holun
  Date: 2021/6/28
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="static/js/jquery-3.6.0.js"></script>
    <script>
        $(document).ready(function(){
            $("#button1").click(function(){
                $.post(
                    "${pageContext.request.contextPath}/t2",
                    function (data) {

                        let html = "";
                        for (let i = 0; i < data.length; i++) {
                            html = html + "<tr>"
                                     + "<td>" + data[i].id + "</td>"
                                     + "<td>" + data[i].name + "</td>"
                                     + "<td>" + data[i].pwd + "</td>" +
                                    "</tr>"
                        }
                        $("#context").html(html);
                    }
                );
            });
        });
    </script>

</head>
<body>

<input type="button" value="加载数据" id="button1" >
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
    </tr>
    <tbody id="context">

    </tbody>
</table>

</body>
</html>
