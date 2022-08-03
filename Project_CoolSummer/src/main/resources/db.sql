create table restplace(
	r_no number(15) primary key,
	r_seq_no number(15) not null,
	equp_type number(5) not null,
	r_area_nm varchar2(200 char) not null,
	r_detl_add varchar2(200 char),
	j_detl_add varchar2(200 char),
	r_area_sqr number(5) not null,
	use_prnb number(5) not null,
	chk1_yn varchar2(2 char),
	chk2_yn varchar2(2 char),
	chk3_yn varchar2(2 char)
);

create sequence r_no_seq

select * from restplace;

drop table restplace cascade constraint purge;
drop sequence r_no_seq;

/*
	private BigDecimal r_seq_no;	// 시설 번호
	private BigDecimal equp_type;	// 시설 유형(번호로 되어있음)
	private String r_area_nm;		// 쉼터 명칭
	private String r_detl_add;		// 도로명 주소
	private String j_detl_add;		// 지번 주소
	private String r_area_sqr;		// 면적
	private BigDecimal use_prnb;	// 이용 가능 인원
	private String chk1_yn;			// 야간 개방 여부
	private String chk2_yn;			// 휴일 개방 여부
	private String chk3_yn;			// 숙박 가능 여부
 */