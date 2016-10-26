
package com.tourfirm.web.controller;

import java.util.List;

import com.tourfirm.domain.City;
import com.tourfirm.service.CityService;
import com.tourfirm.service.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoreController {

    @Autowired
    private CityService cityService;
    
    @GetMapping("/")
    public ModelAndView Index() {

        ModelAndView model = new ModelAndView("index");
        return model;
    }



}
