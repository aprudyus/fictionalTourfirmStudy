package com.tourfirm.web.controller;


import com.tourfirm.service.CityService;
import com.tourfirm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public String Clients(Model model){

        model.addAttribute("clients",clientService.listClients());

        return "clients";
    }

    /*@RequestMapping( value = "/hotels/{city}", method = RequestMethod.GET)
    public String HotelsC(Model model, @PathVariable String city){

        model.addAttribute("hotelsC", hotelService.listHotelsC(city));

        return "hotelsC";
    }

    @RequestMapping( value = "/hotel/{id}", method = RequestMethod.GET)
    public String Hotel(Model model, @PathVariable Integer id){

        model.addAttribute("hotel", hotelService.findById(id));

        return "hotel";
    }*/
}
