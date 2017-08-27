package com.ecnu.back.controller;

import com.ecnu.model.HelloEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.io.IOException;

@Controller
public class BackIndexController {

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index() {
		System.out.print("index");
		return "backindex.html";
	}
	
	@GetMapping(value = "/login")
	public String login() {
		return "backlogin.html";
	}


	@PostMapping(value = "/loginPost")
	@ResponseBody
	public HelloEntity loginPost(ModelMap modelMap, @RequestParam("username")String name, @RequestParam("password")String pswd) throws ServletException, IOException {
		HelloEntity helloEntity = new HelloEntity(2,"liuzhi");
		System.out.print( name);
		System.out.print(pswd);
		System.out.print("sucesss1");
		modelMap.addAttribute("hello",1);
		return  helloEntity;
		//return "backlogin.html";
	}
}
