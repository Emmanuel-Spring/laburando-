package com.talentyco.springboot.controller;

import java.util.Date;

import com.talentyco.springboot.model.entity.Vacante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String mostrarHome(Model modelo) {
		
		modelo.addAttribute("titulo", "Bienvenidos al portal de empleo");
		modelo.addAttribute("fecha", new Date());
		
		return "index";
	}


}
