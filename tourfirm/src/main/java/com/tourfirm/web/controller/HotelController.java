package com.tourfirm.web.controller;


import com.tourfirm.domain.Hotel;
import com.tourfirm.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ManyToOne;
import java.util.List;

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
    public String HotelsC(Model model, @PathVariable String city){

        model.addAttribute("hotelsC", hotelService.listHotelsC(city));

        return "hotelsC";
    }

    @RequestMapping( value = "/hotel/{id}", method = RequestMethod.GET)
    public String Hotel(Model model, @PathVariable Integer id){

        model.addAttribute("hotel", hotelService.findById(id));

        return "hotel";
    }
}