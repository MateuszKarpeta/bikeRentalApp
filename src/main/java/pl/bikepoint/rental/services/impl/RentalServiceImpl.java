package pl.bikepoint.rental.services.impl;

import org.springframework.stereotype.Service;
import pl.bikepoint.rental.dao.contract.Order;
import pl.bikepoint.rental.dao.contract.RentalDuration;
import pl.bikepoint.rental.repository.OrderRepository;
import pl.bikepoint.rental.services.RentalService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {

    private final OrderRepository orderRepository;

    public RentalServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void rentBike(Order order, RentalDuration rental) {
        order.setRental(rental);
        order.setRentalPrice(calculatePrice(order));
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
