package pl.bikepoint.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.bikepoint.rental.services.impl.BikeServiceImpl;

@RestController
@RequestMapping(value = "/bikes")
public class BikeController {

  private final BikeServiceImpl bikeServiceImpl;

  @Autowired
    public BikeController(BikeServiceImpl bikeServiceImpl) {
        this.bikeServiceImpl = bikeServiceImpl;
    }

    @GetMapping
    public ModelAndView allBikes() {
        ModelAndView mav = new ModelAndView("bikes");
        mav.addObject("bikes", bikeServiceImpl.findAllBikes());
        return mav;
    }
}
