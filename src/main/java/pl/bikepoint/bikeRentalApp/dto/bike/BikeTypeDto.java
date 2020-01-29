package pl.bikepoint.bikeRentalApp.dto.bike;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.bikepoint.bikeRentalApp.enums.BikeTypeE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BikeTypeDto {

    private Long id;
    private BikeTypeE type;

}
