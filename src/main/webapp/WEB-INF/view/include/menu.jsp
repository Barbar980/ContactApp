<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${sessionScope.userId==null}">
    <%-- Iser is not yet logged in --%>
    
</c:if>
<a href="#">Home</a> | <a href="#">Login</a> | <a href="#">Register</a> | <a href="#">About</a>