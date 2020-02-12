package pl.bikepoint.rental.dao.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
@Entity(name = "users")

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank(message = "Name is mandatory")
    @Size(min=2, max=30)
    private String firstName;

    //@NotBlank(message = "Last name is mandatory")
    @Size(min=2, max=30)
    private String lastName;

    //@NotBlank(message = "Email is mandatory")
    private String email;

    //@NotBlank(message = "Phone number is mandatory")
    private long phoneNo;
}
