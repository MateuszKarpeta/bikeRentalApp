package pl.bikepoint.bikeRentalApp.model.person;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

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

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addresses",
            foreignKey = @ForeignKey(name = "address_id_fk", value = ConstraintMode.NO_CONSTRAINT))
    private AddressEntity address;*/
}
