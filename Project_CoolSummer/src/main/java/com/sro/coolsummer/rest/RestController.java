package com.sro.coolsummer.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestController {
	@Autowired
	private RestDAO rDAO;
	
	@RequestMapping(value = "/restplace.search", method = RequestMethod.GET)
	public String getRestplace(Rest r, HttpServletRequest req) {
		rDAO.getGAdd(r, req);
		rDAO.searchRest(r, req);
		req.setAttribute("srp", "restAll.jsp");
		return "home";
	}
}