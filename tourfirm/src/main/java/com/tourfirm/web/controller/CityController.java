package com.tourfirm.web.controller;


import com.tourfirm.domain.City;
import com.tourfirm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public String Cities(Model model){

        model.addAttribute("cities",cityService.listCities());

        return "cities";
    }

    @RequestMapping( value = "/country/{country}", method = RequestMethod.GET)
    public String CitiesC(Model model, @PathVariable String country){

        model.addAttribute("citiesC", cityService.listCitiesC(country));

        return "citiesC";
    }
}
