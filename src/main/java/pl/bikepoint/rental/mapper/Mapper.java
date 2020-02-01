package pl.bikepoint.rental.mapper;

import pl.bikepoint.rental.dao.bike.BikeDao;
import pl.bikepoint.rental.dao.bike.BikeTypeDao;
import pl.bikepoint.rental.dao.bike.BrandDao;
import pl.bikepoint.rental.dao.contract.OrderDao;
import pl.bikepoint.rental.dao.contract.PriceListDao;
import pl.bikepoint.rental.dao.contract.RentalDurationDao;
import pl.bikepoint.rental.dto.bike.BikeDto;
import pl.bikepoint.rental.dto.bike.BikeTypeDto;
import pl.bikepoint.rental.dto.bike.BrandDto;
import pl.bikepoint.rental.dto.contract.OrderDto;
import pl.bikepoint.rental.dto.contract.PriceListDto;
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
                .brandDaoName(bikeDto.getBrandDaoName())
                .price(bikeDto.getPrice())
                .bikeTypeDaoE(bikeDto.getBikeTypeDaoE())
                .orderDao(bikeDto.getOrderDao())
                .build();
    }

    public static BikeDto map(BikeDao bikeDao) {
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
                .bikes(orderDto.getBikes())
                .prices(orderDto.getPrices())
                .build();
    }

    public static OrderDto map(OrderDao orderDao) {
        return OrderDto.builder()
                .id(orderDao.getId())
                .rentalPrice(orderDao.getRentalPrice())
                .helmetPrice(orderDao.getHelmetPrice())
                .pedalPrice(orderDao.getPedalPrice())
                .bikes(orderDao.getBikes())
                .prices(orderDao.getPrices())
                .build();
    }

    public static PriceListDto map(PriceListDao priceListDao) {
        return PriceListDto.builder()
                .id(priceListDao.getId())
                .rentals(priceListDao.getRentals())
                .build();
    }

    public static PriceListDao map(PriceListDto priceListDto) {
        return PriceListDao.builder()
                .id(priceListDto.getId())
                .rentals(priceListDto.getRentals())
                .build();
    }

    public static RentalDurationDto map(RentalDurationDao rentalDurationDao) {
        return RentalDurationDto.builder()
                .id(rentalDurationDao.getId())
                .oneDay(rentalDurationDao.getOneDay())
                .twoDays(rentalDurationDao.getTwoDays())
                .threeDays(rentalDurationDao.getThreeDays())
                .priceList(rentalDurationDao.getPriceList())
                .build();
    }

    public static RentalDurationDao map(RentalDurationDto rentalDurationDto) {
        return RentalDurationDao.builder()
                .id(rentalDurationDto.getId())
                .oneDay(rentalDurationDto.getOneDay())
                .twoDays(rentalDurationDto.getTwoDays())
                .threeDays(rentalDurationDto.getThreeDays())
                .priceList(rentalDurationDto.getPriceList())
                .build();
    }
}




