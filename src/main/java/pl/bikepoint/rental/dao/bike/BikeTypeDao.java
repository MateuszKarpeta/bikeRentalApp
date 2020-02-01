package pl.bikepoint.rental.dao.bike;

import lombok.*;
import pl.bikepoint.rental.enums.BikeTypeE;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "bike_type")
@Entity
public class BikeTypeDao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private BikeTypeE type;

}
