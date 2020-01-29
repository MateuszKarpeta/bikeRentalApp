package pl.bikepoint.bikeRentalApp.mapper;

import pl.bikepoint.bikeRentalApp.dao.bike.BikeDao;
import pl.bikepoint.bikeRentalApp.dto.bike.BikeDto;

public class Mapper {

    private Mapper(){}

    public static BikeDao map(BikeDto bikeDto){
        return BikeDao.builder()
                .id(bikeDto.getId())
                .name(bikeDto.getName())
                .modelYear(bikeDto.getModelYear())
                .frameSize(bikeDto.getFrameSize())
                .brandDaoName(bikeDto.getBrandDaoName())
                .price(bikeDto.getPrice())
                .bikeTypeDaoE(bikeDto.getBikeTypeDaoE())
                .orderDao(bikeDto.getOrderDao())
                .build();
    }

    public static BikeDto map(BikeDao bikeDao){
        return BikeDto.builder()
                .id(bikeDao.getId())
                .name(bikeDao.getName())
                .modelYear(bikeDao.getModelYear())
                .frameSize(bikeDao.getFrameSize())
                .brandDaoName(bikeDao.getBrandDaoName())
                .price(bikeDao.getPrice())
                .bikeTypeDaoE(bikeDao.getBikeTypeDaoE())
                .orderDao(bikeDao.getOrderDao())
                .build();
    }
}
