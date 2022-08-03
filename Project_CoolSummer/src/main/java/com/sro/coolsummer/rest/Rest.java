package com.sro.coolsummer.rest;

import java.math.BigDecimal;

public class Rest {
	
	private BigDecimal r_seq_no;	// 시설 번호
	private BigDecimal equp_type;	// 시설 유형(번호로 되어있음)
	private String r_area_nm;		// 쉼터 명칭
	private String r_detl_add;		// 도로명 주소
	private String j_detl_add;		// 지번 주소
	private BigDecimal r_area_sqr;		// 면적
	private BigDecimal use_prnb;	// 이용 가능 인원
	private String chk1_yn;			// 야간 개방 여부
	private String chk2_yn;			// 휴일 개방 여부
	private String chk3_yn;			// 숙박 가능 여부
	
	public Rest() {
		// TODO Auto-generated constructor stub
	}

	public Rest(BigDecimal r_seq_no, BigDecimal equp_type, String r_area_nm, String r_detl_add, String j_detl_add,
			BigDecimal r_area_sqr, BigDecimal use_prnb, String chk1_yn, String chk2_yn, String chk3_yn) {
		super();
		this.r_seq_no = r_seq_no;
		this.equp_type = equp_type;
		this.r_area_nm = r_area_nm;
		this.r_detl_add = r_detl_add;
		this.j_detl_add = j_detl_add;
		this.r_area_sqr = r_area_sqr;
		this.use_prnb = use_prnb;
		this.chk1_yn = chk1_yn;
		this.chk2_yn = chk2_yn;
		this.chk3_yn = chk3_yn;
	}

	public BigDecimal getR_seq_no() {
		return r_seq_no;
	}

	public void setR_seq_no(BigDecimal r_seq_no) {
		this.r_seq_no = r_seq_no;
	}

	public BigDecimal getEqup_type() {
		return equp_type;
	}

	public void setEqup_type(BigDecimal equp_type) {
		this.equp_type = equp_type;
	}

	public String getR_area_nm() {
		return r_area_nm;
	}

	public void setR_area_nm(String r_area_nm) {
		this.r_area_nm = r_area_nm;
	}

	public String getR_detl_add() {
		return r_detl_add;
	}

	public void setR_detl_add(String r_detl_add) {
		this.r_detl_add = r_detl_add;
	}

	public String getJ_detl_add() {
		return j_detl_add;
	}

	public void setJ_detl_add(String j_detl_add) {
		this.j_detl_add = j_detl_add;
	}

	public BigDecimal getR_area_sqr() {
		return r_area_sqr;
	}

	public void setR_area_sqr(BigDecimal r_area_sqr) {
		this.r_area_sqr = r_area_sqr;
	}

	public BigDecimal getUse_prnb() {
		return use_prnb;
	}

	public void setUse_prnb(BigDecimal use_prnb) {
		this.use_prnb = use_prnb;
	}

	public String getChk1_yn() {
		return chk1_yn;
	}

	public void setChk1_yn(String chk1_yn) {
		this.chk1_yn = chk1_yn;
	}

	public String getChk2_yn() {
		return chk2_yn;
	}

	public void setChk2_yn(String chk2_yn) {
		this.chk2_yn = chk2_yn;
	}

	public String getChk3_yn() {
		return chk3_yn;
	}

	public void setChk3_yn(String chk3_yn) {
		this.chk3_yn = chk3_yn;
	}
	
}
