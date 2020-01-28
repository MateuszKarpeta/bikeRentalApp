package pl.bikepoint.bikeRentalApp.model.bike;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
//@Table(name = "brands")
public class Brand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brandName;

    @OneToMany(mappedBy ="brandName")
    public List<Bike> bikeListByBrand;
}
