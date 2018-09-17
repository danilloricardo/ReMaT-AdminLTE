package com.rawsanj.adminlte.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnalisysController {


    @RequestMapping("/analisys")
    public String index() {
        return "analisys/general";
    }

  
}
