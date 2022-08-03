<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>searchResult</title>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<table id="restTable" border="1">
		<tr>
			<td>시설 번호</td>
			<td>시설 유형</td>
			<td>쉼터 명칭</td>
			<td>도로명 주소</td>
			<td>지번 주소</td>
			<td>면적(㎡)</td>
			<td>이용 가능 인원</td>
			<td>야간 개방 여부</td>
			<td>휴일 개방 여부</td>
			<td>숙박 가능 여부</td>
		</tr>
		<tr>
			<c:forEach var="r" items="${restplaces }">
				<tr>
					<td>${r.r_seq_no }</td>
					<td>
						<c:set var="equp_type" value="${r.equp_type }"/>
						<c:choose>
							<c:when test="${equp_type eq '1'}">경로당</c:when>
							<c:when test="${equp_type eq '2'}">복지관</c:when>
							<c:when test="${equp_type eq '5'}">주민센터</c:when>
							<c:when test="${equp_type eq '8'}">금융기관</c:when>
							<c:when test="${equp_type eq '12'}">공원</c:when>
							<c:when test="${equp_type eq '99'}">기타</c:when>
						</c:choose>
					</td>
					<td>${r.r_area_nm }</td>
					<td>${r.r_detl_add }<input id="address" type="hidden"></td>
					<td>${r.j_detl_add }</td>
					<td>${r.r_area_sqr }</td>
					<td>${r.use_prnb }</td>
					<td>${r.chk1_yn }</td>
					<td>${r.chk2_yn }</td>
					<td>${r.chk3_yn }</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>