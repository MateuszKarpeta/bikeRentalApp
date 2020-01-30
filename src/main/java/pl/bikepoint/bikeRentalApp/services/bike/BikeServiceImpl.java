package pl.bikepoint.bikeRentalApp.services.bike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bikepoint.bikeRentalApp.dao.bike.BikeDao;
import pl.bikepoint.bikeRentalApp.dto.bike.BikeDto;
import pl.bikepoint.bikeRentalApp.mapper.Mapper;
import pl.bikepoint.bikeRentalApp.repository.BikeRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BikeServiceImpl implements BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    @Override
    public List<BikeDto> findAllBikes(BikeDto bikeDto) {
        return bikeRepository.findAll()
                .stream()
                .map(Mapper::map)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteBikeById(Long id) {
        BikeDao bikeDao=bikeRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        bikeRepository.delete(bikeDao);
    }

    @Override
    public void addBike(BikeDto bikeDto) {
        BikeDao newbikeDao=Mapper.map(bikeDto);
        bikeRepository.save(newbikeDao);
    }

    /*@Override
    public void editBike(BikeDto bikeDto, Long Id) {
        BikeDao bikeDao=bikeRepository.findById()
                .stream
                .fore
    }*/
}
