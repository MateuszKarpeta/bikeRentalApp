package pl.bikepoint.rental.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pl.bikepoint.rental.dao.contract.Order;
import pl.bikepoint.rental.dao.contract.RentalDetails;
import pl.bikepoint.rental.repository.BikeRepository;
import pl.bikepoint.rental.services.RentalService;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    private final BikeRepository bikeRepository;
    private final RentalService rentalService;

    public RentalController(BikeRepository bikeRepository, RentalService rentalService) {
        this.bikeRepository = bikeRepository;
        this.rentalService = rentalService;
    }

    @GetMapping
    public ModelAndView getAllRentals() {
        ModelAndView mav = new ModelAndView("rentals");
        mav.addObject("rentals", rentalService.findAllRentals());
        return mav;
    }

    @GetMapping("add")
    public ModelAndView getAddRentalForm() {
        ModelAndView mav = new ModelAndView("add-rental");
        mav.addObject("order", new Order());
        mav.addObject("rental", new RentalDetails());
        mav.addObject("bikes", bikeRepository.findAll());
        return mav;
    }

    @PostMapping("add")
    public RedirectView addRental(@ModelAttribute Order order,
                                  @ModelAttribute RentalDetails rental) {
        rentalService.rentBike(order, rental);
        return new RedirectView("/rentals");
    }


}
