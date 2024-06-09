package rikkei.btth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(unique = false, nullable = false)
    private String username;
    @Column( nullable = false)
    private String password;
    @Column( nullable = false)
    private String fullName;
    @Column( nullable = false)
    private String address;
    @Column( nullable = false)
    @Email
    private String email;
    @Column( nullable = false)
    private String phone;
    @Column( nullable = false)
    private Boolean status;

}
