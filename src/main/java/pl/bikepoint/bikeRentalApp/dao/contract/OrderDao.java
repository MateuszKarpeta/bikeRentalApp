package pl.bikepoint.bikeRentalApp.dao.contract;

import lombok.*;
import pl.bikepoint.bikeRentalApp.dao.bike.BikeDao;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "orders")
@Entity
public class OrderDao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal rentalPrice;
    private Float helmetPrice;
    private Float pedalPrice;

    @OneToMany
    private List<PriceListDao> prices;

    @OneToMany
    private List<BikeDao> bikes;

}
