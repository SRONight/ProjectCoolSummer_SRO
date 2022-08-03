//$(function(){
//	searchOnclick()
//	chk1Checked();
//	chk2Checked();
//	chk3Checked();
//	chk1Unchecked();
//	chk2Unchecked();
//	chk3Unchecked();
//	mapOpen();
//});
//
//function searchOnclick(){
//	if($('input[name="chk1_yn"]').is(":checked")){
//		chk1Checked();
//	}else if($('input[name="chk1_yn"]').is(":unchecked")){
//		chk1Unchecked();
//	}
//	
//	if($('input[name="chk2_yn"]').is(":checked")){
//		chk2Checked();
//	}else if($('input[name="chk2_yn"]').is(":unchecked")){
//		chk2Unchecked();
//	}
//	
//	if($('input[name="chk3_yn"]').is(":checked")){
//		chk3Checked();
//	}else if($('input[name="chk3_yn"]').is(":unchecked")){
//		chk3Unchecked();
//	}
//}
//
//function chk1Checked(){
//	var chk1_yn = "";
//	$('input[name="chk1_yn"]:checked').each(function() {
//	    if(chk1_yn==""){
//	    	chk1_yn = $(this).val();
//	    }
//	});
//	$('#chk1_yn').val(chk1_yn);
//}
//
//function chk1Unchecked(){
//	var chk1_yn = "";
//	$('input[name="chk1_yn"]:unchecked').each(function() {
//	    if(chk1_yn==""){
//	    	chk1_yn = "0";
//	    }
//	});
//	$('#chk1_yn').val(chk1_yn);
//}
//
//function chk2Checked(){
//	var chk2_yn = "";
//	$('input[name="chk2_yn"]:checked').each(function() {
//	    if(chk2_yn==""){
//	    	chk2_yn = $(this).val();
//	    }
//	});
//	$('#chk2_yn').val(chk2_yn);
//}
//
//function chk2Unchecked(){
//	var chk2_yn = "";
//	$('input[name="chk2_yn"]:unchecked').each(function() {
//	    if(chk2_yn==""){
//	    	chk2_yn = "0";
//	    }
//	});
//	$('#chk2_yn').val(chk2_yn);
//}
//
//function chk3Checked(){
//	var chk3_yn = "";
//	$('input[name="chk3_yn"]:checked').each(function() {
//	    if(chk3_yn==""){
//	    	chk3_yn = $(this).val();
//	    }
//	});
//	$('#chk3_yn').val(chk3_yn);
//}
//
//function chk3Unchecked(){
//	var chk3_yn = "";
//	$('input[name="chk3_yn"]:unchecked').each(function() {
//	    if(chk3_yn==""){
//	    	chk3_yn = "0";
//	    }
//	});
//	$('#chk3_yn').val(chk_yn);
//}

//$("#restTable tr").click(function(){
//	var tr = $(this);
//	var td = tr.children();
//	var address = td.eq(3).text();
//	alert(address);
//})

//function mapOpen(){
//	
//	var mapContainer = document.getElementById('map').style.display("block"),
//    mapOption = {
//        center: new kakao.maps.LatLng(33.450701, 126.570667),
//        level: 3
//    };
//	let address = $("#address").text();
//	var map = new kakao.maps.Map(mapContainer, mapOption);
//	var geocoder = new kakao.maps.services.Geocoder();
//	geocoder.addressSearch(address, function(result, status) {
//
//	     if (status === kakao.maps.services.Status.OK) {
//
//	        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
//
//	        var marker = new kakao.maps.Marker({
//	            map: map,
//	            position: coords
//	        });
//
//	        var infowindow = new kakao.maps.InfoWindow({
//	            content: '<div style="width:150px;text-align:center;padding:6px 0;">목적지</div>'
//	        });
//	        infowindow.open(map, marker);
//
//	        map.setCenter(coords);
//	    }
//	});
//}

/*	**이 부분은 백업용입니다**
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(33.450701, 126.570667),
			level: 3
		};
		var map = new kakao.maps.Map(mapContainer, mapOption);
		var geocoder = new kakao.maps.services.Geocoder();
		$("#restTable tr").click(function(){
			var tr = $(this);
		    var td = tr.children();
		    var addr = "";
		    addr = td.eq(3).text();
		    $('#address').val(addr);
		    alert($('#address').val());
		    
		    geocoder.addressSearch($('#address').val(), function(result, status) {
		     if (status === kakao.maps.services.Status.OK) {

		        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
		        var marker = new kakao.maps.Marker({
		            map: map,
		            position: coords
		        });
		        var infowindow = new kakao.maps.InfoWindow({
		            content: '<div style="width:150px;text-align:center;padding:6px 0;">우리회사</div>'
		        });
		        infowindow.open(map, marker);
		        map.setCenter(coords);
		    	} 
			});    
		});
 * 
 */