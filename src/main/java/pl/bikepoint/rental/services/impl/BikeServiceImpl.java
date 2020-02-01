package pl.bikepoint.rental.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bikepoint.rental.dao.bike.BikeDao;
import pl.bikepoint.rental.dto.bike.BikeDto;
import pl.bikepoint.rental.dto.contract.OrderDto;
import pl.bikepoint.rental.mapper.Mapper;
import pl.bikepoint.rental.repository.BikeRepository;
import pl.bikepoint.rental.services.BikeService;

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

}
