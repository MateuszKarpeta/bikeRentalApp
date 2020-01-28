package pl.bikepoint.bikeRentalApp.model.contract;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "rental_duration")

public class RentalDuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer oneDay;
    private Integer twoDays;
    private Integer threeDays;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pricelist_id")
    private PriceList priceList;
}
