package pl.bikepoint.rental.dao.contract;

import lombok.*;
import pl.bikepoint.rental.dao.bike.Bike;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "orders")
@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal rentalPrice;
    private Float helmetPrice;
    private Float pedalPrice;

    @OneToOne(cascade = CascadeType.ALL)
    private RentalDuration rental;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Bike bike;

}
