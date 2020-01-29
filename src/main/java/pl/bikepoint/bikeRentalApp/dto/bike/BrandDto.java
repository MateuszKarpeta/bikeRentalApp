package pl.bikepoint.bikeRentalApp.dto.bike;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.bikepoint.bikeRentalApp.dao.bike.BikeDao;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandDto {

    private Long id;
    private String brandName;
    private List<BikeDao> bikes;

}
