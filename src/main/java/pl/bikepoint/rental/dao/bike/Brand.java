package pl.bikepoint.rental.dao.bike;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "brand")
@Entity
public class Brand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brandName;

    @OneToMany
    private List<Bike> bikes;
}
