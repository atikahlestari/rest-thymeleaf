package com.atikah.restthymeleaf.restthymeleaf.controller;


        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping(path = "/")
public class MainController {

    @GetMapping(value = "/")
    public String home(){

        return "index.html";
    }

}
