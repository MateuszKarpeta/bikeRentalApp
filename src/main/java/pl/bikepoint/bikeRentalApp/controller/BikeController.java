package pl.bikepoint.bikeRentalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.bikepoint.bikeRentalApp.dao.bike.BikeDao;
import pl.bikepoint.bikeRentalApp.dto.bike.BikeDto;
import pl.bikepoint.bikeRentalApp.repository.BikeRepository;
import pl.bikepoint.bikeRentalApp.services.impl.BikeServiceImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/bikes")
public class BikeController {

    private final BikeServiceImpl bikeServiceImpl;

    @Autowired
    public BikeController(BikeServiceImpl bikeServiceImpl) {
        this.bikeServiceImpl = bikeServiceImpl;
    }

    @GetMapping
    public ModelAndView allBikes (){
      ModelAndView mav = new ModelAndView("bikes");
      mav.addObject("bikes",bikeServiceImpl.findAllBikes());
      return mav;
    }
}
