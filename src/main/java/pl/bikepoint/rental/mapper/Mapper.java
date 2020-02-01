package pl.bikepoint.rental.mapper;

import pl.bikepoint.rental.dao.bike.BikeDao;
import pl.bikepoint.rental.dao.bike.BikeTypeDao;
import pl.bikepoint.rental.dao.bike.BrandDao;
import pl.bikepoint.rental.dao.contract.OrderDao;
import pl.bikepoint.rental.dao.contract.RentalDurationDao;
import pl.bikepoint.rental.dto.bike.BikeDto;
import pl.bikepoint.rental.dto.bike.BikeTypeDto;
import pl.bikepoint.rental.dto.bike.BrandDto;
import pl.bikepoint.rental.dto.contract.OrderDto;
import pl.bikepoint.rental.dto.contract.RentalDurationDto;

public class Mapper {

    private Mapper() {
    }

    public static BikeDao map(BikeDto bikeDto) {
        return BikeDao.builder()
                .id(bikeDto.getId())
                .name(bikeDto.getName())
                .modelYear(bikeDto.getModelYear())
                .frameSize(bikeDto.getFrameSize())
                .brand(bikeDto.getBrand())
                .price(bikeDto.getPrice())
                .bikeType(bikeDto.getBikeType())
                .orders(bikeDto.getOrders())
                .build();
    }

    public static BikeDto map(BikeDao bikeDao) {
        return BikeDto.builder()
                .id(bikeDao.getId())
                .name(bikeDao.getName())
                .modelYear(bikeDao.getModelYear())
                .frameSize(bikeDao.getFrameSize())
                .brand(bikeDao.getBrand())
                .price(bikeDao.getPrice())
                .bikeType(bikeDao.getBikeType())
                .orders(bikeDao.getOrders())
                .build();
    }

    public static BikeTypeDto map(BikeTypeDao bikeTypeDao) {
        return BikeTypeDto.builder()
                .id(bikeTypeDao.getId())
                .type(bikeTypeDao.getType())
                .build();
    }

    public static BikeTypeDao map(BikeTypeDto bikeTypeDto) {
        return BikeTypeDao.builder()
                .id(bikeTypeDto.getId())
                .type(bikeTypeDto.getType())
                .build();
    }

    public static BrandDto map(BrandDao brandDao) {
        return BrandDto.builder()
                .id(brandDao.getId())
                .brandName(brandDao.getBrandName())
                .bikes(brandDao.getBikes())
                .build();
    }

    public static BrandDao map(BrandDto brandDto) {
        return BrandDao.builder()
                .id(brandDto.getId())
                .brandName(brandDto.getBrandName())
                .bikes(brandDto.getBikes())
                .build();
    }

    public static OrderDao map(OrderDto orderDto) {
        return OrderDao.builder()
                .id(orderDto.getId())
                .rentalPrice(orderDto.getRentalPrice())
                .helmetPrice(orderDto.getHelmetPrice())
                .pedalPrice(orderDto.getPedalPrice())
                .bike(orderDto.getBike())
                .rental(orderDto.getRental())
                .build();
    }

    public static OrderDto map(OrderDao orderDao) {
        return OrderDto.builder()
                .id(orderDao.getId())
                .rentalPrice(orderDao.getRentalPrice())
                .helmetPrice(orderDao.getHelmetPrice())
                .pedalPrice(orderDao.getPedalPrice())
                .bike(orderDao.getBike())
                .rental(orderDao.getRental())
                .build();
    }

    public static RentalDurationDto map(RentalDurationDao rentalDurationDao) {
        return RentalDurationDto.builder()
                .id(rentalDurationDao.getId())
                .rentStartDate(rentalDurationDao.getRentStartDate())
                .rendEndDate(rentalDurationDao.getRendEndDate())
                .build();
    }

    public static RentalDurationDao map(RentalDurationDto rentalDurationDto) {
        return RentalDurationDao.builder()
                .id(rentalDurationDto.getId())
                .rentStartDate(rentalDurationDto.getRentStartDate())
                .rendEndDate(rentalDurationDto.getRendEndDate())
                .build();
    }
}




