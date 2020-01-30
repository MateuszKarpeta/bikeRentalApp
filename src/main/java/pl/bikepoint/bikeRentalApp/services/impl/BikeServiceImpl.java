package pl.bikepoint.bikeRentalApp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bikepoint.bikeRentalApp.dao.bike.BikeDao;
import pl.bikepoint.bikeRentalApp.dto.bike.BikeDto;
import pl.bikepoint.bikeRentalApp.dto.contract.OrderDto;
import pl.bikepoint.bikeRentalApp.mapper.Mapper;
import pl.bikepoint.bikeRentalApp.repository.BikeRepository;
import pl.bikepoint.bikeRentalApp.services.BikeService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
//@Transactional
public class BikeServiceImpl implements BikeService {

    private BikeRepository bikeRepository;

    @Autowired
    public BikeServiceImpl(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Override
    public List<BikeDto> findAllBikes() {
        return bikeRepository.findAll()
                .stream()
                .map(Mapper::map)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteBikeById(Long id) {
        BikeDao bikeDao = bikeRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        bikeRepository.delete(bikeDao);
    }

    @Override
    public void addBike(BikeDto bikeDto) {
        BikeDao newBikeDao = Mapper.map(bikeDto);
        bikeRepository.save(newBikeDao);
    }

    @Override
    public float calculatePrice(BikeDto bikeDto, OrderDto orderDto) {
        return 0f;
    }

    /*@Override
    public void editBike(BikeDto bikeDto, Long Id) {
        BikeDao bikeDao=bikeRepository.findById()
                .stream
                .fore
    }*/
}
