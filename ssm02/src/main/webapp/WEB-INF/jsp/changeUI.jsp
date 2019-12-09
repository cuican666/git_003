
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script>
    $(function () {
       $("#change").click(function () {
           var itemName=$("#name").val();
           var typeId=$("#type").get(0).selectedIndex;
           var necessary=$("#necessary").val();
           var ref=$("#ref").val();
           var price=$("#price").val();
           var info=$("#info").val();

           $.ajax({

           });
       });
    });
</script>

<body>
    <h1>项目信息维护</h1>
    <form name="form" id="form" action="${pageContext.request.contextPath}/peItems/change" method="post">
        <table>
            <tr>
                <td>项目名称：</td>
                <td><input type="text" name="name" id="name" value="${item.itemName}"/></td>
            </tr>
            <tr>
                <td>所属类别：</td>
                <td>
                    <select>
                        <c:forEach var="itemType" items="${itemTypes}">
                            <option name="type" id="type"
                                    <c:if test="${itemType.typeName} == ${item.itemName}">selected="selected"</c:if>>
                                    ${item.itemName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>是否必查：</td>

                <c:if test="${item.necessary} ==1">
                    <input type="text" name="necessary" id="necessary" value="是"/>
                </c:if>
            </tr>
            <tr>
                <td>参考值：</td>
                <td><input type="text" name="ref" id="ref" value="${item.ref}"/></td>
            </tr>
            <tr>
                <td>价格：</td>
                <td><input type="text" name="price" id="price" value="${item.price}"/></td>
            </tr>
            <tr>
                <td>说明：</td>
                <td><input type="text" name="info" id="info" value="${item.info}"/></td>
            </tr>
            <tr>
                <td><a href="${pageContext.request}/peItems/change"/></td>
                <td><input type="button" name="clear" value="取消"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
