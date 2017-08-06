package com.snowman.blog.web;

import com.snowman.blog.model.Users;
import com.snowman.blog.service.UsersService;
import com.snowman.blog.utils.BlogException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by SnowMan on 2017/7/14.
 */
@Controller
@RequestMapping("/users")
@Api(value = "/users", tags = "用户接口")
public class UsersController {

    private static Logger logger = Logger.getLogger(UsersController.class);

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "用户登陆", notes = "用户登陆", httpMethod = "POST", response = String.class)
    public String login(Users users, HttpServletRequest request, RedirectAttributes attr){
        String view = "redirect:/";
        try {
            Users login_users = usersService.findLogin(users);
            if(login_users != null){
                request.getSession().setAttribute("users", login_users);
                view = "redirect:toHome";
            } else {
                attr.addFlashAttribute("msg","用户名或密码错误。");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return view;
    }

    @RequestMapping("/toHome")
    @ApiOperation(value = "跳转博客主页页面", notes = "跳转博客主页页面", httpMethod = "GET", response = String.class)
    public String toHome(){
        return "home";
    }

    @RequestMapping("/toReg")
    @ApiOperation(value = "跳转注册用户页面", notes = "跳转注册用户页面", httpMethod = "GET", response = String.class)
    public String toReg(){
        return "reg";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    @ApiOperation(value = "创建注册用户", notes = "创建注册用户", httpMethod = "POST", response = String.class)
    public String regUser(Users users, RedirectAttributes attr){
        String view = "reg";
        try{
            boolean flag = usersService.saveUsers(users);
            if(flag){
                view = "redirect:/";
            }
        } catch (BlogException ex) {
            attr.addFlashAttribute("msg", ex.getCauses());
            view = "redirect:toReg";
            ex.printStackTrace();
        }
        return view;
    }
}
