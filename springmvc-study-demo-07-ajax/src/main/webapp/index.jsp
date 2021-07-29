<%--
  Created by IntelliJ IDEA.
  User: Holun
  Date: 2021/6/28
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="static/js/jquery-3.6.0.js"></script>
    <script type="text/javascript">

        function fun() {
            /*$.ajax(
                {
                    //异步请求的url
                    url:"",
                    //需要发送的数据
                    data:{
                        name:$("#name").val()
                    },
                    //异步请求成功后，调用的回调函数
                    success:function (data) {
                        alert(data);
                    },
                    //异步请求失败后，调用的回调函数
                    error:function (){
                        alert("请求失败!");
                    }
                }
            )*/

            $.post(
                "${pageContext.request.contextPath}/t1",

                {
                    name:$("#name").val()
                },

                function (result) {
                    alert(result);
                }
            )
        }
    </script>
</head>
<body>

<input type="text" id="name" onblur="fun()" />

</body>
</html>
