package pl.bikepoint.bikeRentalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bikepoint.bikeRentalApp.dao.bike.BikeDao;
import pl.bikepoint.bikeRentalApp.services.bike.BikeServiceImpl;

import java.util.List;

@Controller
@RequestMapping(name = "/bikes")
public class BikeController {

    @Autowired
    private BikeServiceImpl bikeServiceImpl;

    @PostMapping
    public BikeDao addBike (@RequestBody BikeDao bikeDao) {
        return bikeServiceImpl.addBike(bikeDao);

    @GetMapping
    public List<BikeDao> getCustomers(){

    }

}
