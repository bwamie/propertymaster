package com.property.mgt.controller;

import java.util.LinkedList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.property.mgt.domain.Authority;
import com.property.mgt.domain.User;
import com.property.mgt.service.UserService;

import antlr.collections.List;

@Controller
public class LoginController {

    @Autowired
    UserService userService;
	
	@RequestMapping(value={"/login"}, method = RequestMethod.GET)
    public String getLoginPage(@ModelAttribute("user")User user, Model model) {
        Authority client = new Authority("client");
        Authority staff = new Authority("staff");

        LinkedList<Authority> authorities1 = new LinkedList<Authority>();
        LinkedList<Authority> authorities2 = new LinkedList<Authority>();
        authorities1.add(client);
        authorities2.add(staff);

        User user1 = new User("alex", "alex");
        user1.setAuthorities(authorities1);
        user1.setRole("staff");

        User user2 = new User("xie", "xie");
        user2.setAuthorities(authorities2);
        user2.setRole("client");

        userService.addUser(user1);
        userService.addUser(user2);       
		
		return "login/login";
    }

    @RequestMapping(value="/postlogin", method = RequestMethod.POST)
    public String loginAction(@Valid @ModelAttribute("user")User loginUser, BindingResult result, Model model) {
    	 	if (result.hasErrors()) {

             System.out.println(result.getAllErrors());
             return "login/login";
         }

         System.out.println("role is: " + loginUser.getRole());

         User localUser = userService.getUserByName(loginUser.getUsername());

         Boolean match = userService.isLoginedUser(localUser);

         if (match == true) {
             return "welcome";
         } else {
             String errorStr = "username or password doesn't match";
             model.addAttribute("error", errorStr);
             return "login/login";
         }
    }
    
    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String getRegisterPage(@ModelAttribute("user")User user, Model model) {
        LinkedList<Authority> authorities = userService.getAllAuthories();

        user.setAuthorities(authorities);

        return "login/register";
    }


    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String registerAction(@Valid @ModelAttribute("user")User registerUser, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "login/register";
        }

        Boolean canRegister = userService.canRegisterWithUsername(registerUser.getUsername());

        if (canRegister == true) {
            System.out.println("register success!!! ");
            userService.addUser(registerUser);

            return "login/login";
        } else {
            String errorStr = "username has been registered!!";
            model.addAttribute("error", errorStr);
            return "login/register";
        }

    }

    @RequestMapping(value="/loginfailed", method = RequestMethod.GET)
    public String getLoginFailedPage() {
        return "loginFailed";
    }
    
    
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {
 		return "redirect:/welcome";
 	}
}

