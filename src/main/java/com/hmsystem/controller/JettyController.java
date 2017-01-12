package com.hmsystem.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class JettyController {
	
	@RequestMapping("/olamundo")
    @ResponseBody
	public String olaMundo() {
		return "Olá Mundo!!";
	}
	
	@RequestMapping("/")
    @ResponseBody
	public String ola() {
		return "Olá!!";
	}

}
