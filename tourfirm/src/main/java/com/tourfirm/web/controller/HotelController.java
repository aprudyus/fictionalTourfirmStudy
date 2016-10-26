package com.tourfirm.web.controller;


import com.tourfirm.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotels")
    public String Hotels(Model model){

        model.addAttribute("hotels",hotelService.listHotels());

        return "hotels";
    }

    @RequestMapping( value = "/hotels/{city}", method = RequestMethod.GET)
    public String CitiesC(Model model, @PathVariable String city){

        model.addAttribute("hotelsC", hotelService.listHotelsC(city));

        return "hotelsC";
    }
}