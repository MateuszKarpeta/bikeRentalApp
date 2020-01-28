package pl.bikepoint.bikeRentalApp.model.person;

import lombok.*;
import pl.bikepoint.bikeRentalApp.model.contract.OrderlItem;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String department;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address",
            foreignKey = @ForeignKey(name = "address_id_fk", value = ConstraintMode.NO_CONSTRAINT))
    private Address address;

    @OneToMany(mappedBy = "employee",fetch = FetchType.LAZY)
    private List<OrderlItem> orderlItemList;
}
