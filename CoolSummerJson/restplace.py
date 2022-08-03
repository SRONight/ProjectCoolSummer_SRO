# -*- coding:utf-8 -*-

from http.client import HTTPConnection
from cx_Oracle import connect
from json import loads

hc = HTTPConnection('openapi.seoul.go.kr:8088')
con = connect('sro/1@192.168.0.7:1521/xe')
cur = con.cursor()
for r in range(1,4000,1000):
    if(r<=4000):
        url = f'/62634e47494365733130377358635a76/json/TbGtnHwcwP/{r}/{r+999}/'
    else:
        url = f'/62634e47494365733130377358635a76/json/TbGtnHwcwP/{r}/{r+114}/'
    hc.request('GET', url)
    rb = hc.getresponse().read()
    restplace = loads(rb)
    if "TbGtnHwcwP" in restplace:
        for p in restplace["TbGtnHwcwP"]["row"]:
            sql = "insert into restplace values(r_no_seq.nextval, '%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')" % (p["R_SEQ_NO"], p["EQUP_TYPE"], p["R_AREA_NM"], p["R_DETL_ADD"], p["J_DETL_ADD"], p["R_AREA_SQR"], p["USE_PRNB"], p["CHK1_YN"], p["CHK2_YN"], p["CHK3_YN"])
            cur.execute(sql)
con.commit()
con.close()
hc.close()
print('DB insert 성공!')