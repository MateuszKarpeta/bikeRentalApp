package pl.bikepoint.bikeRentalApp.model.contract;

import lombok.*;
import pl.bikepoint.bikeRentalApp.model.bike.Bike;
import pl.bikepoint.bikeRentalApp.model.person.Customer;
import pl.bikepoint.bikeRentalApp.model.person.Employee;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "rental_item")
public class OrderlItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal rentalPrice;
    private Float helmetPrice;
    private Float pedalPrice;

    @OneToMany(mappedBy = "priceList", fetch = FetchType.LAZY)
    private List<PriceList> priceLists;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",
            foreignKey = @ForeignKey(name = "customer_id_fk", value = ConstraintMode.NO_CONSTRAINT))
    private Customer customer;

    @OneToMany(mappedBy = "orderlItem", fetch = FetchType.LAZY)
    private List<Bike> bikeList;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id",
            foreignKey = @ForeignKey(name = "employee_id_fk", value = ConstraintMode.NO_CONSTRAINT))
    private Employee employee;

}
