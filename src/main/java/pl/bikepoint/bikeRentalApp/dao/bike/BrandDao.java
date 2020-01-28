package pl.bikepoint.bikeRentalApp.dao.bike;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "brands")
@Entity
public class BrandDao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brandName;

    @OneToMany
    public List<BikeDao> bikeDaoListByBrand;
}
