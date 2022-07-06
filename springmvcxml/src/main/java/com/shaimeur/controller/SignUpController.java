package com.shaimeur.controller;

import com.shaimeur.controller.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class SignUpController {

    // @RequestMapping(value = "/singup",method = RequestMethod.GET)

    @GetMapping({"/", "/singup"})
    public String getSignUpForm() {
        return "singUpForm";
    }

    //@RequestMapping(value = "/singup",method = RequestMethod.POST)
    @PostMapping("/singup")
    public String saveUser(User user) {
        System.out.println(user);
        return "result";
    }

}
