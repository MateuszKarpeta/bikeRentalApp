package pl.bikepoint.rental.dao.contract;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "rental_dates")
@Entity
public class RentalDuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate rentStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate rentEndDate;

    private boolean pedals;
    private boolean helmet;

    public int getNumberOfDays(){
        return Period.between(rentStartDate,rentEndDate).getDays();
    }
}
