package pl.bikepoint.rental.services.impl;

import pl.bikepoint.rental.repository.BikeRepository;
import pl.bikepoint.rental.repository.OrderRepository;
import pl.bikepoint.rental.services.RentalService;

public class RentalServiceImpl implements RentalService {

    private final BikeRepository bikeRepository;
    private final OrderRepository orderRepository;

    public RentalServiceImpl(BikeRepository bikeRepository, OrderRepository orderRepository) {
        this.bikeRepository = bikeRepository;
        this.orderRepository = orderRepository;
    }


    @Override
    public void rentBike() {

    }

    @Override
    public void calculatePrice() {

    }
}
