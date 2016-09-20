<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<h2>Spittles for ${spitter.username}</h2>
	<table cellspacing="15">
		<c:forEach items="${spittleList}" var="spittle">
<%-- 			<h2>Spittles for ${spittle.spittleText}</h2> --%>
			<tr>
				<td><img
					src="<s:url value="/resources/${spitter.id}.jpg"/>"
					width="48" height="48" /></td>
				<td><a
					href="<s:url value="/spitters/${spittle.spitter_id}"/>">
						${spittle.id}</a> <c:out value="${spittle.spittleText}" /><br />
					<c:out value="${spittle.postedTime}" /></td>
			</tr>
		</c:forEach>
	</table>
</div>