package com.cgs.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class Controller {

	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String jasyptMsg() {
		return "Jenkins App is Working!!";
	}
}
