package com.sro.coolsummer.rest;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestDAO {
	
	@Autowired
	private SqlSession ss;
	
	// 모든 쉼터 정보
	public void getAllRest(HttpServletRequest req) {
		try {
			req.setAttribute("restplaces", ss.getMapper(RestMapper.class).getAllRest());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 구 한글변환
	public void getGAdd(Rest r, HttpServletRequest req) {
		try {
			// db가 조건에 설정된 한글값을 다이렉트로 읽지 못해서 번호로 바꾸고 해당 번호에 맞는 구를 가나다순으로 나열
			if(req.getParameter("r_detl_add").equals("1")) {
				r.setR_detl_add("강남구");
			}else if(req.getParameter("r_detl_add").equals("2")){
				r.setR_detl_add("강동구");
			}else if(req.getParameter("r_detl_add").equals("3")){
				r.setR_detl_add("강북구");
			}else if(req.getParameter("r_detl_add").equals("4")){
				r.setR_detl_add("강서구");
			}else if(req.getParameter("r_detl_add").equals("5")){
				r.setR_detl_add("관악구");
			}else if(req.getParameter("r_detl_add").equals("6")){
				r.setR_detl_add("광진구");
			}else if(req.getParameter("r_detl_add").equals("7")){
				r.setR_detl_add("구로구");
			}else if(req.getParameter("r_detl_add").equals("8")){
				r.setR_detl_add("금천구");
			}else if(req.getParameter("r_detl_add").equals("9")){
				r.setR_detl_add("노원구");
			}else if(req.getParameter("r_detl_add").equals("10")){
				r.setR_detl_add("도봉구");
			}else if(req.getParameter("r_detl_add").equals("11")){
				r.setR_detl_add("동대문구");
			}else if(req.getParameter("r_detl_add").equals("12")){
				r.setR_detl_add("동작구");
			}else if(req.getParameter("r_detl_add").equals("13")){
				r.setR_detl_add("서대문구");
			}else if(req.getParameter("r_detl_add").equals("14")){
				r.setR_detl_add("서초구");
			}else if(req.getParameter("r_detl_add").equals("15")){
				r.setR_detl_add("성동구");
			}else if(req.getParameter("r_detl_add").equals("16")){
				r.setR_detl_add("성북구");
			}else if(req.getParameter("r_detl_add").equals("17")){
				r.setR_detl_add("송파구");
			}else if(req.getParameter("r_detl_add").equals("18")){
				r.setR_detl_add("양천구");
			}else if(req.getParameter("r_detl_add").equals("19")){
				r.setR_detl_add("영등포구");
			}else if(req.getParameter("r_detl_add").equals("20")){
				r.setR_detl_add("용산구");
			}else if(req.getParameter("r_detl_add").equals("21")){
				r.setR_detl_add("은평구");
			}else if(req.getParameter("r_detl_add").equals("22")){
				r.setR_detl_add("종로구");
			}else if(req.getParameter("r_detl_add").equals("23")){
				r.setR_detl_add("중구");
			}else {
				r.setR_detl_add("중랑구");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 조건에 맞는 쉼터 정보 검색
	public void searchRest(Rest r, HttpServletRequest req) {
		try {
			req.setAttribute("restplaces", ss.getMapper(RestMapper.class).getRestplace(r));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}