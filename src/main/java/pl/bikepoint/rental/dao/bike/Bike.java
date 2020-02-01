package pl.bikepoint.rental.dao.bike;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.bikepoint.rental.dao.contract.Order;
import pl.bikepoint.rental.enums.FrameSize;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "bike")
@Entity
public class Bike implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private FrameSize frameSize;
    private Integer modelYear;
    private Float price;

    @ManyToOne
    @JoinColumn(name = "bike_type")
    private BikeType bikeType;

    @ManyToOne
    @JoinColumn(name = "brand")
    private Brand brand;

    @OneToMany
    private List<Order> orders;

}
