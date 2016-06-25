package com.huangpf.controller;

import com.huangpf.po.UserT;
import com.huangpf.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		UserT user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		Logger logger = Logger.getLogger(UserController.class);

		UserT insertUser = new UserT(5l,"insertTest","insertTest",Short.parseShort("28"));
		this.userService.insertUserT(insertUser);
		return "showUser";
	}
}
