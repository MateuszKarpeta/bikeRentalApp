package pl.bikepoint.rental.dto.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.bikepoint.rental.dao.contract.PriceListDao;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RentalDurationDto {

    private Long id;
    private Integer oneDay;
    private Integer twoDays;
    private Integer threeDays;
    private PriceListDao priceList;

}
