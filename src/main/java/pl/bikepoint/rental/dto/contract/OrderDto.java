package pl.bikepoint.rental.dto.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.bikepoint.rental.dao.bike.BikeDao;
import pl.bikepoint.rental.dao.contract.RentalDurationDao;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDto {

    private Long id;
    private BigDecimal rentalPrice;
    private Float helmetPrice;
    private Float pedalPrice;
    private RentalDurationDao rental;
    private BikeDao bike;

}
