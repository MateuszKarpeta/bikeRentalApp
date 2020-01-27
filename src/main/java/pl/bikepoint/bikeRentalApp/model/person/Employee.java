package pl.bikepoint.bikeRentalApp.model.person;

import lombok.*;

import javax.persistence.Entity;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
public class Employee {
    private Long id;
    private String department;
}
