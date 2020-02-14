package pl.bikepoint.rental.dao.contract;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Discount {

    @Id
    @Column(unique = true)
    String name;
    BigDecimal value;

}
