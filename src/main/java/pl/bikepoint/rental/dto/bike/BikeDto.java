package pl.bikepoint.rental.dto.bike;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.bikepoint.rental.dao.bike.BikeTypeDao;
import pl.bikepoint.rental.dao.bike.BrandDao;
import pl.bikepoint.rental.dao.contract.OrderDao;
import pl.bikepoint.rental.enums.FrameSize;


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
