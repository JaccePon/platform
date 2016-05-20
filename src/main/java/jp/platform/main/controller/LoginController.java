package jp.platform.main.controller;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import jp.platform.main.entity.User;
import jp.platform.main.service.UserService;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	
		/*@Autowired
	    private ResourceService resourceService;*/
	    @Autowired
	    private UserService userService;

    @RequestMapping(value = "/loginForm"    )
    public String showLoginForm(HttpServletRequest req, Model model) {
       /* String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
        String error = null;
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
        }
        model.addAttribute("error", error);*/
        return "/error.html";
    }
    
    @RequestMapping(value = "/login"    )
    public String testone(HttpServletRequest req, Model model) {
    	  String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
        String error = null;
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
        }
        model.addAttribute("error", error);
    	return "/login.html";
    }
    
    @RequestMapping("/")
    public String index(@jp.platform.system.common.resolver.CurrentUser User loginUser, Model model) {
        //Set<String> permissions = userService.findPermissions(loginUser.getUsername());
        //List<Resource> menus = resourceService.findMenus(permissions);
        model.addAttribute("menus", "");
        return "/error.html";
    }

}
