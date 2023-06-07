package com.yazlab.projeone.controller;

import com.yazlab.projeone.model.WordInput;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MetinController {

    @GetMapping("/")
    public String homepage(){
        return "inndex";
    }

}
