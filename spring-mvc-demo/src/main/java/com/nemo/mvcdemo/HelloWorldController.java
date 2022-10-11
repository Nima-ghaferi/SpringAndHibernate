package com.nemo.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("show-form")
    public String showForm() {
        return "hello-world-form";
    }

    @RequestMapping("process-form")
    public String processForm() {
        return "hello-world";
    }

    @RequestMapping("process-form-v2")
    public String letsShoutDude (HttpServletRequest req, Model model) {
        String name = req.getParameter("studentName");
        name = name.toUpperCase();
        String result = "Yo! " + name;
        model.addAttribute("message", result);
        return "hello-world";
    }

    @RequestMapping("process-form-v3")
    public String processFormVersionThree(@RequestParam("studentName") String studentName, Model model) {
        String name = studentName;
        name = name.toUpperCase();
        String result = "Hey! " + name;
        model.addAttribute("message", result);
        return "hello-world";
    }
}
