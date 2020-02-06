package pl.bikepoint.rental.dao.contract;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import pl.bikepoint.rental.enums.PedalType;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RentalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate rentStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate rentEndDate;
    private PedalType pedalType;
    private boolean helmetRented;

    public int getNumberOfDays(){
        return Period.between(rentStartDate,rentEndDate).getDays();
    }
}
