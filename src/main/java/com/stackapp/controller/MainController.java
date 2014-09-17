package com.stackapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class MainController {
	@RequestMapping("getform")
	public @ResponseBody
	String createUserNode(Model model) throws Exception {

		return "index.jsp";
	}
}
