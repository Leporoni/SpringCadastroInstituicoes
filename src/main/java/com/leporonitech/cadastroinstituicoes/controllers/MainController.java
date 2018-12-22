package com.leporonitech.cadastroinstituicoes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("mensagem", "Games forever!!!");
		return "index";
	}

}
