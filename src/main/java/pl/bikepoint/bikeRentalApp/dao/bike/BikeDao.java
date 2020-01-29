package pl.bikepoint.bikeRentalApp.dao.bike;

import lombok.*;
import pl.bikepoint.bikeRentalApp.dao.contract.OrderDao;
import pl.bikepoint.bikeRentalApp.enums.FrameSize;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "bikes")
@Entity
public class BikeDao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private FrameSize frameSize;
    private Integer modelYear;
    private Float price;

    @ManyToOne
    @JoinColumn(name = "bike_type",
            foreignKey = @ForeignKey(name = "bikeType_id_fk"))
    private BikeTypeDao bikeTypeDaoE;

    @ManyToOne
    @JoinColumn(name = "brand",
            foreignKey = @ForeignKey(name = "brand_id_fk", value = ConstraintMode.NO_CONSTRAINT))
    private BrandDao brandDaoName;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderDao orderDao;

}
