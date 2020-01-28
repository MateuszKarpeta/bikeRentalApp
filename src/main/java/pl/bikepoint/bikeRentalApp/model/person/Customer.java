package pl.bikepoint.bikeRentalApp.model.person;

import lombok.*;
import pl.bikepoint.bikeRentalApp.model.contract.OrderlItem;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Data
@Entity
@Table(name = "customer")

public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long personalId;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<OrderlItem> orderlItemList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address",
            foreignKey = @ForeignKey(name = "address_id_fk", value = ConstraintMode.NO_CONSTRAINT))
    private Address address;
}
