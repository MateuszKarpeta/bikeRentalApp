package pl.bikepoint.rental.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bikepoint.rental.dao.bike.Bike;
import pl.bikepoint.rental.repository.BikeRepository;
import pl.bikepoint.rental.services.BikeService;

import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {

    private BikeRepository bikeRepository;

    @Autowired
    public BikeServiceImpl(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Override
    public List<Bike> findAllBikes() {
        return bikeRepository.findAll();
    }

    @Override
    public void deleteBikeById(Long id) {
        Bike bike = bikeRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        bikeRepository.delete(bike);
    }

    @Override
    public void addBike(Bike bike) {
        bikeRepository.save(bike);
    }

}
