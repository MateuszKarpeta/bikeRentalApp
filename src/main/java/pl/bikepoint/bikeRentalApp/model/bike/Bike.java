package pl.bikepoint.bikeRentalApp.model.bike;

import lombok.*;
import pl.bikepoint.bikeRentalApp.model.contract.OrderlItem;
import pl.bikepoint.bikeRentalApp.model.enums.FrameSize;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

//@Table(name = "bikes")
@Entity
public class Bike implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String generalInfo;
    private String specification;
    @Enumerated(EnumType.STRING)
    private FrameSize frameSize;
    private Integer modelYear;
    private Float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bike_type",
            foreignKey = @ForeignKey(name = "bikeType_id_fk", value = ConstraintMode.CONSTRAINT))
    private BikeType bikeTypeE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand",
            foreignKey = @ForeignKey(name = "brand_id_fk", value = ConstraintMode.NO_CONSTRAINT))
    private Brand brandName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private OrderlItem orderlItem;

}
