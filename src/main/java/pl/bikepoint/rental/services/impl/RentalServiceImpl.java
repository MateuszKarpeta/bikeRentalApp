package pl.bikepoint.rental.services.impl;

import org.springframework.stereotype.Service;
import pl.bikepoint.rental.dao.contract.Order;
import pl.bikepoint.rental.dao.contract.RentalDuration;
import pl.bikepoint.rental.repository.OrderRepository;
import pl.bikepoint.rental.repository.RentalRepository;
import pl.bikepoint.rental.services.RentalService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {

    private final OrderRepository orderRepository;
    private final RentalRepository rentalRepository;

    public RentalServiceImpl(OrderRepository orderRepository, RentalRepository rentalRepository) {
        this.orderRepository = orderRepository;
        this.rentalRepository = rentalRepository;
    }

    @Override
    public void rentBike(Order order, RentalDuration rental) {
        order.setRental(rental);
        order.setRentalPrice(calculatePrice(order));
//        rentalRepository.save(rental);
        orderRepository.save(order);
    }

    @Override
    public List<Order> findAllRentals() {
        return orderRepository.findAll();
    }

    private BigDecimal calculatePrice(Order order) {
        LocalDate startDate = order.getRental().getRentStartDate();
        LocalDate endDate = order.getRental().getRentEndDate();
        Float price = order.getBike().getPrice();

        int days = Period.between(startDate, endDate).getDays();
        return BigDecimal.valueOf(price).multiply(BigDecimal.valueOf(days));
    }
}
