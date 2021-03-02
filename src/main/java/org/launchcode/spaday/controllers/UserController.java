package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {
    private User user;

    @GetMapping()
    public String getIndex() {return "user/index";}

    @GetMapping("add")
    public String displayAddUserForm(Model model) {
        if(user != null) {
            model.addAttribute("username", user.getUsername());
            model.addAttribute("email", user.getEmail());
        }
        return "user/add";
    }

    @PostMapping()
    public String handleSignup(@ModelAttribute User user, Model model, @RequestParam String verifyPassword){
        model.addAttribute("username", user.getUsername());
        if(user.getPassword().equals(verifyPassword)) {

            return "user/index";
        }
        model.addAttribute("email", user.getEmail());
        model.addAttribute("error", "Passwords do not match!");
        return "user/add";
    }
}
