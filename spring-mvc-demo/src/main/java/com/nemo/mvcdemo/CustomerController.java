package com.nemo.mvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initBinder (WebDataBinder dataBinder) {
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, editor);
    }

    @RequestMapping("/show-form")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/process-form")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
        System.out.println("Last name: |" + customer.getLastName() + "|");
        System.out.println("BindingResult: " + result);
        System.out.println("\n\n");
        if (result.hasErrors()) {
            return "customer-form";
        }
        return "customer-confirmation";
    }
}
