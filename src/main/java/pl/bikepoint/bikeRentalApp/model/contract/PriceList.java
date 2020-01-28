package pl.bikepoint.bikeRentalApp.model.contract;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
public class PriceList implements Serializable {

    //Bike price+rentalDuration+ optional z OrderItem
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "priceList", fetch = FetchType.LAZY)
    private List<RentalDuration> rentalDurations;

}

/**
 * @ManyToOne
 * @JoinColumn(name = "",
 * foreignKey = @ForeignKey(name = "order_item_id_fk", value = ConstraintMode.NO_CONSTRAINT))
 * private OrderlItem orderlItem;
 */
