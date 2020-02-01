package pl.bikepoint.rental.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.bikepoint.rental.dao.bike.BikeDao;
import pl.bikepoint.rental.dao.contract.OrderDao;
import pl.bikepoint.rental.dao.contract.RentalDurationDao;
import pl.bikepoint.rental.repository.BikeRepository;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    private final BikeRepository bikeRepository;

    public RentalController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping
    public ModelAndView getAllRentals() {
        ModelAndView mav = new ModelAndView("rentals");
        mav.addObject("rentals");
        return mav;
    }

    @GetMapping("add")
    public ModelAndView getAddRentalForm() {
        ModelAndView mav = new ModelAndView("add-rental");
        mav.addObject("order", new OrderDao());
        mav.addObject("bike", new BikeDao());
        mav.addObject("rental", new RentalDurationDao());
        mav.addObject("bikes", bikeRepository.findAll());
        return mav;
    }


}
