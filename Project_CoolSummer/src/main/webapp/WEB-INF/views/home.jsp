<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cool Summer!</title>
<script type="text/javascript" src="resources/js/jQuery.js"></script>
<link rel="stylesheet" href="resources/css/coolsummer.css">
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=453ac30626bf27c0411527914ce591fc&libraries=services"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<div id="TitleArea">
		<table>
			<tr>
				<td><a href="home.go"><img src="resources/img/snowflake64px.png"></a></td>
				<td><h1><a href="home.go" style="text-decoration:none;">무더위 쉼터 찾기!</a></h1></td>
			</tr>
		</table>
	</div>
	<form action="restplace.search" method="GET">
		<table id="searchMenuArea" border="1">
			<tr id="equp_type">
				<td>
					<label>시설 유형</label> 
					<select name="equp_type" id="equp_type">
						<option value="1">경로당</option>
						<option value="2">복지관</option>
						<option value="5">주민센터</option>
						<option value="8">금융기관</option>
						<option value="12">공원</option>
						<option value="99">기타</option>
					</select>
				</td>
			</tr>
			<tr id="r_detl_add">
				<td>
					<label>구 선택</label> 
					<select name="r_detl_add" id="r_detl_add">
						<option value="1">강남구</option>
						<option value="2">강동구</option>
						<option value="3">강북구</option>
						<option value="4">강서구</option>
						<option value="5">관악구</option>
						<option value="6">광진구</option>
						<option value="7">구로구</option>
						<option value="8">금천구</option>
						<option value="9">노원구</option>
						<option value="10">도봉구</option>
						<option value="11">동대문구</option>
						<option value="12">동작구</option>
						<option value="13">서대문구</option>
						<option value="14">서초구</option>
						<option value="15">성동구</option>
						<option value="16">성북구</option>
						<option value="17">송파구</option>
						<option value="18">양천구</option>
						<option value="19">영등포구</option>
						<option value="20">용산구</option>
						<option value="21">은평구</option>
						<option value="22">종로구</option>
						<option value="23">중구</option>
						<option value="24">중랑구</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<label>이용 가능 인원</label> 
					<select name="use_prnb" id="use_prnb">
						<option value="1">1명</option>
						<option value="2">2명</option>
						<option value="3">3명</option>
						<option value="4">4명</option>
						<option value="5">5명</option>
						<option value="6">6명</option>
						<option value="7">7명</option>
						<option value="8">8명</option>
						<option value="9">9명</option>
						<option value="10">10명</option>
						<option value="11">11명</option>
						<option value="12">12명</option>
						<option value="13">13명</option>
						<option value="14">14명</option>
						<option value="15">15명</option>
						<option value="16">16명</option>
						<option value="17">17명</option>
						<option value="18">18명</option>
						<option value="19">19명</option>
						<option value="20">20명</option>
					</select> (이상)
				</td>
			</tr>
			<tr>
				<td>
					야간 개방<input type="checkbox" name="chk1_yn" value="Y"> | 
					휴일 개방<input type="checkbox" name="chk2_yn" value="Y"> | 
					숙박 가능<input type="checkbox" name="chk3_yn" value="Y">
				</td>
			</tr>
			<tr>
				<td>
					<button onclick="searchOnclick()">조회하기</button>
				</td>
			</tr>
		</table>
	</form>
	<div id="map" style="width:100%;height:400px;"></div>
	<table id="searchResultArea">
		<tr>
			<td align="center"><jsp:include page="${srp }"/></td>
		</tr>
	</table>
	<script type="text/javascript">
		var mapContainer = document.getElementById('map'),
	    mapOption = {
	        center: new kakao.maps.LatLng(33.450701, 126.570667),
	        level: 3
	    };  
		var map = new kakao.maps.Map(mapContainer, mapOption);
		var geocoder = new kakao.maps.services.Geocoder();
		
		// 스크롤 이벤트를 위해 지도 윗부분 위치 받아옴
		let mapTop = $('#map').offset().top;
		
		$("#restTable tr").click(function(){	// 행 클릭
			// 지금 누른 행에서 주소와 정보 추출해 변수에 담기
			var tr = $(this);
		    var td = tr.children();
		    
		    var name = td.eq(2).text();
		    var jaddr = td.eq(4).text();
		    var area = td.eq(5).text();
		    var user = td.eq(6).text();
		    var chk1 = td.eq(7).text();
		    var chk2 = td.eq(8).text();
		    var chk3 = td.eq(9).text();
		    
		    var addr = "";
            if(tr.index() != 0){
					addr = td.eq(3).text();
				}else{
					addr = "none";
				}
		    $('#address').val(addr);
		    
		    // 어딜 눌렀었는지 알기 쉽게 배경색 변경
		    $("#restTable tr").css("backgroundColor", "");
		    tr.css("background-color", "#64b5f6");
		    
		    geocoder.addressSearch($('#address').val(), function(result, status) {
		     if (status === kakao.maps.services.Status.OK) {

		        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
		        var marker = new kakao.maps.Marker({
		            map: map,
		            position: coords
		        });
		        var infowindow = new kakao.maps.InfoWindow({
		            content: '<div style="width:300px;text-align:left;padding:10px 0;font-size:13px;">'+name+'<br>주소 : '+addr+'(지번 : '+jaddr+')<br>면적 : '+area+'㎡<br>이용 가능 인원 : '+user+'명<br>야간 개방 여부 : '+chk1+'<br>휴일 개방 여부 : '+chk2+'<br>숙박 가능 여부 : '+chk3+'</div>'
		        });
		        infowindow.open(map, marker);
		        map.setCenter(coords);
		    	} 
			});
		    // 스크롤 이벤트
		    $(window).scrollTop(mapTop - 50);
		});
	</script>
</body>
</html>