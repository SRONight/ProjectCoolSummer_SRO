package com.sro.coolsummer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sro.coolsummer.rest.RestDAO;

@Controller
public class HomeController {
	@Autowired
	private RestDAO rDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		rDAO.getAllRest(req);
		req.setAttribute("srp", "restAll.jsp");
		return "home";
	}
	
	@RequestMapping(value = "/home.go", method = RequestMethod.GET)
	public String home2(HttpServletRequest req) {
		return home(req);
	}
}