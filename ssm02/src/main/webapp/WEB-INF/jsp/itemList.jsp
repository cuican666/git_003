
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script>
    $(function () {
        function queryItem() {

        }
    });
</script>

<body>
    <h1>体检项目查询</h1>

    <select>
        <option name="type" value="-1">请选择项目类别</option>
        <c:forEach var="itemType" items="${itemTypes}">
            <option name="type">${itemType}</option>
        </c:forEach>
    </select>

    <button name="select" onclick="queryItem()">查询</button>

    <table>
        <c:forEach var="peItem" items="${peItems}">
            <tr>
                <td>项目名称</td>
                <td>${peItem.itemName}</td>
            </tr>
            <tr>
                <td>所属类别</td>
                <td>${peItem.itemTypes.typeName}</td>
            </tr>
            <tr>
                <td>是否必查</td>

                <c:choose>
                    <c:when test="${peItem.necessary ==1}">
                        <td>是</td>
                    </c:when>
                    <c:otherwise>
                        <td>否</td>
                    </c:otherwise>
                </c:choose>

            </tr>
            <tr>
                <td>参考值</td>
                <td>${peItem.ref}</td>
            </tr>
            <tr>
                <td>价格</td>
                <td>${peItem.price}</td>
            </tr>
            <tr>
                <td>说明</td>
                <td>${peItem.info}</td>
            </tr>
            <tr>
                <td>操作</td>
                <td><a href="${pageContext.request.contextPath}/peItems/show?itemId=${peItem.itemId}"></a>修改</td>
            </tr>

        </c:forEach>
    </table>
</body>
</html>
