package pl.bikepoint.rental.dto.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.bikepoint.rental.dao.contract.RentalDurationDao;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PriceListDto {

    private Long id;
    private List<RentalDurationDao> rentals;
}
