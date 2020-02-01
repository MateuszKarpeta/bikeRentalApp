package pl.bikepoint.rental.dao.bike;

import lombok.*;
import pl.bikepoint.rental.dao.contract.OrderDao;
import pl.bikepoint.rental.enums.FrameSize;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "bikes")
@Entity
public class BikeDao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private FrameSize frameSize;
    private Integer modelYear;
    private Float price;

    @ManyToOne
    @JoinColumn(name = "bike_type")
    private BikeTypeDao bikeType;

    @ManyToOne
    @JoinColumn(name = "brand")
    private BrandDao brand;

    @OneToMany
    private List<OrderDao> orders;

}
