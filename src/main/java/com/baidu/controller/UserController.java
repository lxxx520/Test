package com.baidu.controller;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    // 直接跳转index
    @RequestMapping("/")
    public String l1n(){
        return "index";
    }

    // 新增登记
    @RequestMapping("/insertUser")
    public String insertUser(User user){
        System.out.println(user);
        try{
            userService.insert(user);
        }catch (Exception e){
            e.printStackTrace();
            // 如果服务抛出了异常，代表数据库访问发生错误。
            return "redirect:/faill";
        }
        return "redirect:/loading";
    }

    // 查询登记跳转
    @RequestMapping("/loading")
    public String insert1(){

        return "loading";
    }


    // 查询登记
    @RequestMapping("/listUser")
    public String listUser(Model model){
        List<User> users = userService.selectList();
        model.addAttribute("users",users);
        int i = userService.countOne();
        model.addAttribute("count",i);
        int nan = userService.selctBySex();
        model.addAttribute("nan",nan);
        int nv = i - nan;
        model.addAttribute("nv" ,nv);
        return "list";
    }





}
