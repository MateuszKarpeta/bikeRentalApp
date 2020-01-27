package pl.bikepoint.bikeRentalApp.model.contract;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "rental_item")
public class RentalItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal rentalPrice;
    private Float helmetPrice;
    private Float pedalPrice;

   /* @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name="bikes")
    private List<Bike> bikeList;*/

}
