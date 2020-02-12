package pl.bikepoint.rental.dao.contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import pl.bikepoint.rental.enums.PedalType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RentalDetails implements Serializable {

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
