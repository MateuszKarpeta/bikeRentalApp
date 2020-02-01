package pl.bikepoint.rental.dao.contract;

import lombok.*;
import pl.bikepoint.rental.dao.bike.BikeDao;

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

    @OneToOne
    private RentalDurationDao rental;

    @ManyToOne
    private BikeDao bike;

}
