package com.hu.controller;

import com.github.pagehelper.PageInfo;
import com.hu.pojo.User;
import com.hu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectall")
    public String selectAll(@RequestParam(value = "pageNo",
            required = false,defaultValue = "1") Integer pageNum, Model model){
        PageInfo<User> userlist=userService.getUserPage(pageNum,8);
        //把这个对象存放到request作用域中
        model.addAttribute("userinfo",userlist);
        return "userlist";
    }

    @RequestMapping("/adduser")
    public String insert(User user) {
        //调用业务逻辑层插入方法
        userService.insert(user);
        return "redirect:/user/selectall";
    }

    @RequestMapping("/selectuserById/{op}")
    public String selectUserByUserid(@PathVariable("op") Integer id, Model model) {
        User user = userService.selectUserById(id);
        model.addAttribute("user", user);
        return "userlist";

    }

    @RequestMapping("/upuser")
    public String updateuser(User user) {
        userService.updateuser(user);
        return "redirect:/user/selectall";
    }

    @RequestMapping("/deleteuser/{op}")
    public String deleteuser(@PathVariable("op") Integer id) {
        userService.deleteuser(id);
        return "redirect:/user/selectall";
    }

    @RequestMapping("/login")
    public void checklogin(User user, HttpServletRequest req, HttpServletResponse resp) {
        User ch = userService.checklog(user);
        try {
            if (ch == null) {
                resp.sendRedirect(req.getContextPath() + "/login.jsp");
            } else
            {
                HttpSession s = req.getSession();
                s.setMaxInactiveInterval(5000000);
                s.setAttribute("user", ch);
                resp.sendRedirect(req.getContextPath() + "/main.jsp");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}