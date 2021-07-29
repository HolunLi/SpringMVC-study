
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="static/js/jquery-3.6.0.js"></script>

    <script type="text/javascript">
        function fun_1() {
            $.post(
                "${pageContext.request.contextPath}/t3",

                {
                    uname:$("#uname").val()
                },

                function (data) {
                    //在javascript中 == 只判断值是否相等,比较的双方，只要值相等就返回true。=== 表示绝对等于，要求比较的双方，不仅值要相等，类型也要相同，才返回true
                    if (data === "ok") {
                        $("#display1").css("color","blue");
                    }
                    else
                        $("#display1").css("color","red");

                    $("#display1").html(data)
                }
            )
        }

        function fun_2() {
            $.post(
                "${pageContext.request.contextPath}/t4",

                {
                    upwd:$("#upwd").val()
                },

                function (data) {
                    if (data === "ok") {
                        $("#display2").css("color","blue");
                    }
                    else
                        $("#display2").css("color","red");

                    $("#display2").html(data)
                }
            )
        }

    </script>

</head>

<body>

用户名：<input type="text" id="uname" onblur="fun_1()" />
<span id="display1"></span>
<br><br>

密码：<input type="text" id="upwd" onblur="fun_2()" />
<span id="display2" ></span>
</body>
</html>
