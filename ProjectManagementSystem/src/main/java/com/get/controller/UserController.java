package com.get.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.get.model.Role;
import com.get.model.User;
import com.get.service.RoleService;
import com.get.service.UserService;
import com.get.utility.SecurityUtility;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;
	
	@RequestMapping("/newUser")
	public ModelAndView newUser() {
		
		User user = new User();
		List<Role> roles = (List<Role>) roleService.getAll();
		
		ModelAndView mav = new ModelAndView("user/newUser");	
		mav.addObject("allRoles", roles);
		mav.addObject("user", user);
		
		return mav;
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String createUser(Model model, @ModelAttribute("username") String username,
			@ModelAttribute("email") String email, @ModelAttribute("password") String password,
			@ModelAttribute("name") String name, @ModelAttribute("surname") String surname,
			@ModelAttribute("role") String role, @ModelAttribute("user") User user) {

		
		if (userService.findByUsername(username) != null) {
			model.addAttribute("usernameExists", true);
			//return "createUser";
		}

		String pass = SecurityUtility.randomPassword();
		String encryptedPassword = SecurityUtility.passwordEncoderUtility().encode(pass);

		User user1 = new User(username, encryptedPassword, email, name, surname, true);

		Role r = new Role();
		r.setName(role.toUpperCase());

		return "createUser";
	}

	@RequestMapping("/users")
	public ModelAndView users() {
		ModelAndView mav = new ModelAndView("user/users");
		
		List<User> users = userService.getAll();
		mav.addObject("users", users);
		
		return mav;
	}
}
