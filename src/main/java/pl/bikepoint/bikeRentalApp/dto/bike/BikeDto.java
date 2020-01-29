package pl.bikepoint.bikeRentalApp.dto.bike;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.bikepoint.bikeRentalApp.dao.bike.BikeTypeDao;
import pl.bikepoint.bikeRentalApp.dao.bike.BrandDao;
import pl.bikepoint.bikeRentalApp.dao.contract.OrderDao;
import pl.bikepoint.bikeRentalApp.enums.FrameSize;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BikeDto {

    private Long id;
    private String name;
    private FrameSize frameSize;
    private Integer modelYear;
    private Float price;
    private BikeTypeDao bikeTypeDaoE;
    private BrandDao brandDaoName;
    private OrderDao orderDao;
}
