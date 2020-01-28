package pl.bikepoint.bikeRentalApp.dao.contract;

import lombok.*;

import javax.persistence.*;

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
    private Integer oneDay;
    private Integer twoDays;
    private Integer threeDays;

    @ManyToOne
    @JoinColumn(name = "pricelist_id")
    private PriceListDao priceListDao;
}
