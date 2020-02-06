package pl.bikepoint.rental.services.impl;

import org.springframework.stereotype.Service;
import pl.bikepoint.rental.dao.contract.Order;
import pl.bikepoint.rental.dao.contract.RentalDetails;
import pl.bikepoint.rental.repository.OrderRepository;
import pl.bikepoint.rental.services.RentalService;

import java.math.BigDecimal;
import java.time.Period;
import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {

    private final OrderRepository orderRepository;

    public RentalServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void rentBike(Order order, RentalDetails rental) {
        order.setRental(rental);
        order.setRentalPrice(calculatePrice(order));
        orderRepository.save(order);
    }

    @Override
    public List<Order> findAllRentals() {
        return orderRepository.findAll();
    }

    private BigDecimal calculatePrice(Order order) {
        RentalDetails rental = order.getRental();
        Float bikeBasePrice = order.getBike().getPrice();

        int pedalPrice = rental.getPedalType().getPrice();

        int days = Period.between(rental.getRentStartDate(), rental.getRentEndDate()).getDays();
        return BigDecimal.valueOf(bikeBasePrice)
                .add(BigDecimal.valueOf(pedalPrice))
                .add(BigDecimal.valueOf(rental.isHelmetRented() ? 2 : 0))
                .multiply(BigDecimal.valueOf(days));
    }
}
