package pl.bikepoint.bikeRentalApp.model.person;

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

public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String country;
    private String city;
    private String postalCode;
    private String street;
    private Integer houseNumber;
    private long phone;

    @OneToMany(mappedBy = "address")
    private List<Customer> customerList;

    @OneToMany(mappedBy = "address")
    private List<Employee> employeeList;
}
