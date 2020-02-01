package pl.bikepoint.rental.dto.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RentalDurationDto {

    private Long id;
    private LocalDate rentStartDate;
    private LocalDate rendEndDate;
}
