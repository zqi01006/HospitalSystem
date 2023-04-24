package haogu.user.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class UserController {

    @PostMapping("/login")
    public String login(){
        return "login success";
    }

}
