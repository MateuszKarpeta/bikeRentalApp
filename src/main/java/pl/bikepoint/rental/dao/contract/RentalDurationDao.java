package pl.bikepoint.rental.dao.contract;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "rentals")
@Entity
public class RentalDurationDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate rentStartDate;
    private LocalDate rendEndDate;
//    @ManyToOne
//    @JoinColumn(name = "pricelist_id")
//    private PriceListDao priceList;
}
