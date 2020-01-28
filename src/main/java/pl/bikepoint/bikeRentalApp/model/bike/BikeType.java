package pl.bikepoint.bikeRentalApp.model.bike;

import lombok.*;
import pl.bikepoint.bikeRentalApp.model.enums.BikeTypeE;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

//@Table(name = "BikeTypes")
@Entity
public class BikeType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="bike_type")
    @Enumerated(EnumType.STRING)
    private BikeTypeE bikeTypeE;

    @OneToMany(mappedBy = "bikeTypeE")
    public List<Bike> bikeList;

}
