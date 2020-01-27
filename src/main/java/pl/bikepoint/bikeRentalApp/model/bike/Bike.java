package pl.bikepoint.bikeRentalApp.model.bike;

import lombok.*;
import pl.bikepoint.bikeRentalApp.model.enums.FrameSize;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity

@Table(name = "bikes")

public class Bike implements Serializable {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String generalInfo;
    private String specification;
    @Enumerated (EnumType.STRING)
    private FrameSize frameSize;
    private Integer modelYear;
    private Float price;

}
