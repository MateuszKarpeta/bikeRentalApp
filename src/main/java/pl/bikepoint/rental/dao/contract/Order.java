package pl.bikepoint.rental.dao.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    private String discountCode;

    @OneToOne(cascade = CascadeType.ALL)
    private RentalDetails rental;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Bike bike;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

}
