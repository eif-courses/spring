package com.example.controllers;

import com.example.models.PrekeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Marius on 2/12/2017.
 */
@Controller
public class PrekesController {
    private PrekeService prekeService;

    @Autowired
    public void setPrekeService(PrekeService prekeService) {
        this.prekeService = prekeService;
    }

    @GetMapping("/prekes")
    public String list(Model model){
        model.addAttribute("prekes", prekeService.atvaizduotiPrekes());
        return "prekes";
    }
    @RequestMapping("preke/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("preke", prekeService.prekePagalId(id));
        return "preke";
    }

}
